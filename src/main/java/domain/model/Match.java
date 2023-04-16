package domain.model;

import domain.util.MatchStatus;
import infrastructure.entity.MatchEntity;
import infrastructure.entity.TeamEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Match {
     private Long id;
     Team teamA;
     Team teamB;

     MatchStatus matchStatus;
     LocalDate date;

    public Match() {;
    }

    public Match(Long id) {
         this.id = id;
     }

    public Match(Long id, Team teamA, Team teamB, int matchStatus, LocalDate date) {
        this.id = id;
        this.teamA = teamA;
        this.teamB = teamB;
        this.matchStatus = MatchStatus.values()[matchStatus];
        this.date = date;
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
                id, teamA.toEntity(), teamB.toEntity(), matchStatus.ordinal(), date
        );
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

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }

    public Long getId() {
        return id;
    }
}
