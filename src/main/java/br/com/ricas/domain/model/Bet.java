package br.com.ricas.domain.model;

import br.com.ricas.infrastructure.entity.BetEntity;
import br.com.ricas.infrastructure.entity.BettorEntity;
import br.com.ricas.infrastructure.entity.RoundMatchEntity;

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
