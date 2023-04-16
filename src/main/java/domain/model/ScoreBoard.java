package domain.model;

import infrastructure.entity.ScoreBoardEntity;

public class ScoreBoard {

    private int id;
    private Bettor bettor;
    private int points;
    private Match match;

    public ScoreBoard(Bettor bettor, int points, Match match) {
        this.bettor = bettor;
        this.points = points;
        this.match = match;
    }
    public Bettor getBettor() {
        return bettor;
    }

    public int getPoints() {
        return points;
    }

    public int getId() {
        return id;
    }

    public Match getMatch() {
        return match;
    }

    public ScoreBoard toDomain() {
        return new ScoreBoard(bettor, points, match);
    }

    public ScoreBoardEntity toEntity() {
        return new ScoreBoardEntity(
                id, bettor, points, match);
    }

}
