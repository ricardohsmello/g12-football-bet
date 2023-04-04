package br.com.ricas.infrastructure.entity;

import br.com.ricas.domain.model.RoundMatch;
import br.com.ricas.domain.model.Match;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "round_match_entity")
public class RoundMatchEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "round_match_id")
    Long id;

    private Long round;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL, optional = false)
    @JoinColumn(name = "match_id", nullable = false)
    private MatchEntity match;

    public RoundMatch toDomain() {
        return new RoundMatch(id, round, match.toDomain());
    }

    public RoundMatchEntity(Long id, Long round, Match match) {
        this.id = id;
        this.round = round;
        this.match = match.toEntity();

    }

    public RoundMatchEntity() {
    }
}
