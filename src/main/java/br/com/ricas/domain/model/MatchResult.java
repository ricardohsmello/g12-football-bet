package br.com.ricas.domain.model;

public class MatchResult {
    private Match match;
    private String result;

    public void setMatch(Match match) {
        this.match = match;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Match getMatch() {
        return match;
    }

    public String getResult() {
        return result;
    }
}
