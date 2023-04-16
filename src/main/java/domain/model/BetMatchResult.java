package domain.model;

public class BetMatchResult {

    private int round;
    private String name;
    private String bet;
    private String teamA;
    private String teamB;
    private String result;

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBet() {
        return bet;
    }

    public void setBet(String bet) {
        this.bet = bet;
    }

    public String getTeamA() {
        return teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
