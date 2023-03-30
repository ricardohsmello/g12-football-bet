package br.com.ricas.domain.model;

import br.com.ricas.domain.util.MatchStatus;

import java.time.LocalDateTime;
import java.util.List;

public class Match {
     private List<Team> teams;
     private MatchStatus matchStatus;
     private LocalDateTime date;
     private List<Bettor> bettors;

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public void setMatchStatus(MatchStatus matchStatus) {
        this.matchStatus = matchStatus;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setBettors(List<Bettor> bettors) {
        this.bettors = bettors;
    }

    public List<Bettor> getBettors() {
        return bettors;
    }
}
