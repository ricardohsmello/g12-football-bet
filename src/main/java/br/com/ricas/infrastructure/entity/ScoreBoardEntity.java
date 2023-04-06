package br.com.ricas.infrastructure.entity;

import br.com.ricas.domain.model.Bettor;
import br.com.ricas.domain.model.Match;
import br.com.ricas.domain.model.ScoreBoard;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "score_board_entity")
public class ScoreBoardEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "score_board_id")
    int id;


    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.MERGE, optional = false)
    @JoinColumn(name = "bettor_id",  nullable = false)
    public BettorEntity bettor;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.MERGE, optional = false)
    @JoinColumn(name = "match_id",  nullable = false)
    public MatchEntity match;

    private int points;

    public ScoreBoardEntity(int id, Bettor bettor, int points, Match match) {
        this.id = id;
        this.bettor = bettor.toEntity();
        this.points = points;
        this.match = match.toEntity();
    }

    public ScoreBoard toDomain() {
        return new ScoreBoard( bettor.toDomain(), points, match.toDomain());
    }

    public ScoreBoardEntity() {
    }



}
