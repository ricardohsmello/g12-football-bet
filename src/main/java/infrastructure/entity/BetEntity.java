package infrastructure.entity;

import domain.model.Bet;
import domain.model.Bettor;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "bet_entity")
public class BetEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "bet_id")
    Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL, optional = false)
    @JoinColumn(name = "bettor_id",  nullable = false)
    private BettorEntity bettor;


    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL, optional = false)
    @JoinColumn(name = "round_match_id",  nullable = false)
    private RoundMatchEntity roundMatchEntity;

    private String bet;

    public BetEntity(Long id, Bettor bettor, RoundMatchEntity roundMatchEntity, String bet) {
        this.id = id;
        this.bettor = bettor.toEntity();
        this.roundMatchEntity = roundMatchEntity;
        this.bet = bet;
    }

    public Bet toDomain() {
        return new Bet(id, bettor, roundMatchEntity, bet);
    }

    public BetEntity() {
    }
}
