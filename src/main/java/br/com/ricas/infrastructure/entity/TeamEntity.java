package br.com.ricas.infrastructure.entity;

import br.com.ricas.domain.model.Team;
import br.com.ricas.domain.util.TeamEnum;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "team_entity")
public class TeamEntity extends PanacheEntity {
    Long id;

    String name;

    public TeamEntity() {
    }
    public TeamEntity(String name) {
        this.name = name;
    }

    public Team toDomain() {
        return new Team(id, name);
    }
}