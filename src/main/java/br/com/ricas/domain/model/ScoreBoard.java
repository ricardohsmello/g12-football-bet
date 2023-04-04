package br.com.ricas.domain.model;

public class ScoreBoard {
    private Bettor bettor;
    private int points;
    public ScoreBoard(Bettor bettor, int points) {
        this.bettor = bettor;
        this.points = points;
    }
    public Bettor getBettor() {
        return bettor;
    }

    public int getPoints() {
        return points;
    }
}
