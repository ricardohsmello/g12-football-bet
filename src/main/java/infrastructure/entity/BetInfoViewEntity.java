package infrastructure.entity;

import domain.model.Match;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bet_info_view_entity")

public class BetInfoViewEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "bet_info_id")
    Long id;

    @Column(name = "round")
    public Integer round;

    @Column(name = "bet")
    public String bet;

    @Column(name = "home_team")
    public String homeTeam;

    @Column(name = "visiting_team")
    public String visitingTeam;

    @Column(name = "result")
    public String result;

    public String getBet() {
        return bet;
    }

    public String getResult() {
        return result;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL, optional = false)
    @JoinColumn(name = "bettor_id",  nullable = false)
    public BettorEntity bettor;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL, optional = false)
    @JoinColumn(name = "match_id",  nullable = false)
    public MatchEntity match;

    public MatchEntity getMatch() {
        return match;
    }

    public BettorEntity getBettor() {
        return bettor;
    }

    public static List findByRound(Integer round) {
        String sql =
                "select be.id, m.id as match_id, rm.round, b.name as bettor, b.id as bettor_id, be.bet, home.name as home_team, visiting.name as visiting_team, mr.result " +
                "from bettor_entity b, bet_entity be, match_entity m, round_match_entity rm, " +
                "team_entity home, team_entity visiting, " +
                "match_result_entity mr " +
                "where be.bettor_id = b.id " +
                "and m.id  = rm.match_id " +
                "and home.id = m.team1_id " +
                "and visiting.id = m.team2_id " +
                "and mr.match_id = m.id " +
                "and rm.match_id = be.round_match_id " +
                "and rm.round = ? ";

        return getEntityManager().createNativeQuery(sql, BetInfoViewEntity.class)
                .setParameter(1, round).getResultList();
     }
}
