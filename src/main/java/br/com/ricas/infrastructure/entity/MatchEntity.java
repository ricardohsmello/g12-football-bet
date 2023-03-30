package br.com.ricas.infrastructure.entity;

   import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;
import java.time.LocalDateTime;
   import java.util.List;

@Entity
@Table(name = "match_entity")
public class MatchEntity extends PanacheEntity {
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "team1_id", nullable = false)
    private TeamEntity team1;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "team2_id", nullable = false)
    private TeamEntity team2;

    private int matchStatus;
    private LocalDateTime date;

    public MatchEntity() {
    }

    public MatchEntity(TeamEntity team1, TeamEntity team2, int matchStatus, LocalDateTime date) {
        this.team1 = team1;
        this.team2 = team2;
        this.matchStatus = matchStatus;
        this.date = date;
    }
}
