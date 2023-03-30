package br.com.ricas.domain.model;

import br.com.ricas.domain.util.TeamEnum;
import br.com.ricas.infrastructure.entity.TeamEntity;
public class Team {
    private Long id;
    private String name;

    public Team() {
    }

    public Team(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public TeamEntity toEntity() {
        return new TeamEntity(name);
    }
}
