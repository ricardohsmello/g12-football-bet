package br.com.ricas.domain.model;

import br.com.ricas.domain.util.TeamEnum;

public class Team {
    private int id;
    private TeamEnum team;

    public Team(TeamEnum team) {
        this.team = team;
    }
}
