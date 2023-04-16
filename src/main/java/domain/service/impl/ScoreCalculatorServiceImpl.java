package domain.service.impl;

import domain.service.ScoreCalculatorService;
import domain.util.GameResultEnum;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class ScoreCalculatorServiceImpl implements ScoreCalculatorService {
    @Override
    public int calculatePoints(int[] matchScores, int[] betScores) {
        if (matchScores[0] == betScores[0] && matchScores[1] == betScores[1]) {
            int totalGoalsOnTheMatch = matchScores[0] + matchScores[1];
            return totalGoalsOnTheMatch >= 4 ? 11 : 10;
        } else {
            GameResultEnum matchResult = getGameResult(matchScores[0], matchScores[1]);
            GameResultEnum betResult = getGameResult(betScores[0], betScores[1]);
            return matchResult == betResult ? 5 : 0;
        }
    }

    @Override
    public GameResultEnum getGameResult(int homeScore, int awayScore) {
        return homeScore > awayScore ? GameResultEnum.VICTORY :
                homeScore < awayScore ? GameResultEnum.DEFEAT : GameResultEnum.DRAW;
    }
}
