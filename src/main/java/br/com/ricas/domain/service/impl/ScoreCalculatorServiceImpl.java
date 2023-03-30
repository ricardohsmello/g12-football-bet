package br.com.ricas.domain.service.impl;

import br.com.ricas.domain.service.ScoreCalculatorService;
import br.com.ricas.domain.util.GameResultEnum;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ScoreCalculatorServiceImpl implements ScoreCalculatorService {
    @Override
    public int calculatePoints(int[] matchScores, int[] betScores) {
        if (matchScores[0] == betScores[0] && matchScores[1] == betScores[1]) {
            return 10;
        } else {
            GameResultEnum matchResult = getGameResult(matchScores[0], matchScores[1]);
            GameResultEnum betResult = getGameResult(betScores[0], betScores[1]);
            return matchResult == betResult ? 5 : 0;
        }
    }

    @Override
    public GameResultEnum getGameResult(int homeScore, int awayScore) {
        if (homeScore > awayScore) {
            return GameResultEnum.VICTORY;
        } else if (homeScore < awayScore) {
            return GameResultEnum.DEFEAT;
        } else {
            return GameResultEnum.DRAW;
        }
    }
}
