package br.com.ricas.service;


import domain.service.impl.ScoreCalculatorServiceImpl;
import domain.util.GameResultEnum;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ScoreCalculatorServiceTest {

    @Test
    public void shouldReturn10whenBetMatchesWithTheEntireResult() {
        var score = new ScoreCalculatorServiceImpl();
        int[] matchScores = { 1, 2 };
        int[] betScores = { 1, 2 };

        assertEquals(score.calculatePoints(matchScores, betScores), 10);
    }

    @Test
    public void shouldReturn5whenBetGuessedTheVictorious() {
        var score = new ScoreCalculatorServiceImpl();
        int[] matchScores = { 3, 2 };
        int[] betScores = { 1, 0 };

        assertEquals(score.calculatePoints(matchScores, betScores), 5);
    }

    @Test
    public void shouldReturn0whenBetDidNotGuessedTheVictorious() {
        var score = new ScoreCalculatorServiceImpl();
        int[] matchScores = { 3, 2 };
        int[] betScores = { 1, 5 };

        assertEquals(score.calculatePoints(matchScores, betScores), 0);
    }
    @Test
    public void shouldReturnDefeatWhenFirstResultIsLessThanSecond() {
        var score = new ScoreCalculatorServiceImpl();
        GameResultEnum gameResultEnum = score.getGameResult(3, 4);
        assertEquals(gameResultEnum, GameResultEnum.DEFEAT);
    }
    @Test
    public void shouldReturnVictoryWhenFirstResultIsBiggerThanSecond() {
        var score = new ScoreCalculatorServiceImpl();
        GameResultEnum gameResultEnum = score.getGameResult(2, 1);
        assertEquals(gameResultEnum, GameResultEnum.VICTORY);
    }
    @Test
    public void shouldReturnDrawWhenFirstResultIsEqualsThanSecond() {
        var score = new ScoreCalculatorServiceImpl();
        GameResultEnum gameResultEnum = score.getGameResult(1, 1);
        assertEquals(gameResultEnum, GameResultEnum.DRAW);
    }

}
