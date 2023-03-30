package br.com.ricas.domain.model;

import br.com.ricas.domain.util.MatchStatus;
import br.com.ricas.infrastructure.entity.MatchEntity;

import java.time.LocalDateTime;

public class Match {
     private int id;
     private Team teamA;
     private Team teamB;

     private MatchStatus matchStatus;
     private LocalDateTime date;

     public Match(int id) {
         this.id = id;
     }

    public void setMatchUp(Team teamA, Team teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public void setMatchStatus(MatchStatus matchStatus) {
        this.matchStatus = matchStatus;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public MatchEntity toEntity() {
        return new MatchEntity(
                teamA.toEntity(), teamB.toEntity(), matchStatus.ordinal(), date
        );
    }
}
