package br.com.ricas.infrastructure.entity;

import br.com.ricas.domain.model.Team;
import br.com.ricas.domain.util.TeamEnum;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "team_entity")
public class
TeamEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_team")
    @JoinColumn(name = "team_id")
    Long id;

    String name;

    public TeamEntity() {
    }
    public TeamEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Team toDomain() {
        return new Team(id, name);
    }
}