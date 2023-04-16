package infrastructure.entity;

import domain.model.Match;
import domain.model.MatchResult;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "match_result_entity")
public class MatchResultEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "match_result_id")
    Long id;

    private String result;

    @ManyToOne(fetch = FetchType.LAZY)
    private MatchEntity match;

    public MatchResultEntity() {
    }

    public MatchResultEntity(MatchEntity match, String result) {
        this.match = match;
        this.result = result;
    }

    public MatchResult toDomain() {
        return new MatchResult(id, match.toDomain(), result);
    }
}