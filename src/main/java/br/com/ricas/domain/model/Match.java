package br.com.ricas.domain.model;

import br.com.ricas.domain.util.MatchStatus;
import br.com.ricas.infrastructure.entity.MatchEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Match {
     private int id;
     Team teamA;
     Team teamB;

     MatchStatus matchStatus;
     LocalDate date;

    public Match() {
    }

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

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public MatchEntity toEntity() {
        return new MatchEntity(
                teamA.toEntity(), teamB.toEntity(), matchStatus.ordinal(), date
        );
    }

    public int getId() {
        return id;
    }

    public Team getTeamA() {
        return teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public MatchStatus getMatchStatus() {
        return matchStatus;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }
}
