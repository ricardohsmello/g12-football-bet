package infrastructure.entity;

import domain.model.RoundMatch;
import domain.model.Match;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "round_match_entity")
public class RoundMatchEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "round_match_id")
    int id;

    private int round;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL, optional = false)
    @JoinColumn(name = "match_id", nullable = false)
    private MatchEntity match;

    public RoundMatch toDomain() {
        return new RoundMatch(id, round, match.toDomain());
    }

    public RoundMatchEntity(int id, int round, Match match) {
        this.id = id;
        this.round = round;
        this.match = match.toEntity();

    }

    public RoundMatchEntity() {
    }
}
