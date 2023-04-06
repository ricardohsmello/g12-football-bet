package br.com.ricas.domain.model;

import br.com.ricas.infrastructure.entity.RoundMatchEntity;

public class RoundMatch {

    private int id;

    private int round;

    private Match match;

    public RoundMatch(int id, int round, Match match) {
        this.id = id;
        this.round = round;
        this.match = match;
    }

    public RoundMatchEntity toEntity() {
        return new RoundMatchEntity(id, round, match);
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }


    public int getRound() {
        return round;
    }

    public int getId() {
        return id;
    }
}
