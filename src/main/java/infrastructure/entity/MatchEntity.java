package infrastructure.entity;

import domain.model.Match;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "match_entity")
public class MatchEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "match_id")
    Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL, optional = false)
    @JoinColumn(name = "team1_id", nullable = false)

    private TeamEntity team1;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL, optional = false)
    @JoinColumn(name = "team2_id", nullable = false)
    private TeamEntity team2;

    private int matchStatus;
    private LocalDate date;

    public MatchEntity() {
    }

    public MatchEntity(Long id, TeamEntity team1, TeamEntity team2, int matchStatus, LocalDate date) {
        this.id = id;
        this.team1 = team1;
        this.team2 = team2;
        this.matchStatus = matchStatus;
        this.date = date;
    }

    public Match toDomain() {
        return new Match(id, team1.toDomain(), team2.toDomain(), matchStatus, date);
    }
}
