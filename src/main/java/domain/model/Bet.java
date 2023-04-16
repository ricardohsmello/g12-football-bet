package domain.model;

import infrastructure.entity.BetEntity;
import infrastructure.entity.BettorEntity;
import infrastructure.entity.RoundMatchEntity;

public class Bet {

    private Long id;
    private Bettor bettor;
    private RoundMatch roundMatch;
    private String bet;

    public Bet(Long id, BettorEntity bettor, RoundMatchEntity roundMatchEntity, String bet) {
        this.id = id;
        this.bettor = bettor.toDomain();
        this.roundMatch = roundMatchEntity.toDomain();
        this.bet = bet;
    }

    public Long getId() {
        return id;
    }

    public Bettor getBettor() {
        return bettor;
    }

    public String getBet() {
        return bet;
    }

    public RoundMatch getRoundMatch() {
        return roundMatch;
    }

    public BetEntity toEntity() {
        return new BetEntity(id, bettor, roundMatch.toEntity(), bet);
    }

    public Bet() {
    }
}
