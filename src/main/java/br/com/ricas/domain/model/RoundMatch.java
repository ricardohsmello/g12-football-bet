package br.com.ricas.domain.model;

import br.com.ricas.infrastructure.entity.RoundMatchEntity;

public class RoundMatch {

    private Long id;

    private Long round;

    private Match match;

    public RoundMatch(Long id, Long round, Match match) {
        this.id = id;
        this.round = round;
        this.match = match;
    }


    public RoundMatchEntity toEntity() {
        return new RoundMatchEntity(id, round, match);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Long getRound() {
        return round;
    }
}
