package domain.service;

import domain.util.GameResultEnum;

public interface ScoreCalculatorService {
    int calculatePoints(int[] matchScores, int[] betScores);
    GameResultEnum getGameResult(int homeScore, int awayScore);
}
