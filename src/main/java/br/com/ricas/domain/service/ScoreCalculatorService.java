package br.com.ricas.domain.service;

import br.com.ricas.domain.util.GameResultEnum;

public interface ScoreCalculatorService {
    int calculatePoints(int[] matchScores, int[] betScores);
    GameResultEnum getGameResult(int homeScore, int awayScore);
}
