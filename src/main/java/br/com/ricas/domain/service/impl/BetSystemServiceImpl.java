package br.com.ricas.domain.service.impl;

import br.com.ricas.domain.model.Bettor;
import br.com.ricas.domain.model.MatchResult;
import br.com.ricas.domain.model.ScoreBoard;
import br.com.ricas.domain.service.ExtractScoreService;
import br.com.ricas.domain.service.ScoreCalculatorService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class BetSystemServiceImpl implements br.com.ricas.domain.service.BetSystemService {
    private final ScoreCalculatorService scoreCalculatorService;
    private final ExtractScoreService extractScoreService;
    private final List<ScoreBoard> scoreBoard = new ArrayList<>();

    @Inject
    public BetSystemServiceImpl(
            ScoreCalculatorService scoreCalculatorService,
            ExtractScoreService extractScoreService
    ) {
        this.scoreCalculatorService = scoreCalculatorService;
        this.extractScoreService = extractScoreService;
    }
    @Override
    public void calculate(MatchResult matchResult) {
        int[] matchScores = extractScoreService.extractScores(matchResult.getResult());

        for (Bettor bettor : matchResult.getMatch().getBettors()) {
            int[] betScores = extractScoreService.extractScores(bettor.getBet());
            int points = scoreCalculatorService.calculatePoints(matchScores, betScores);
            ScoreBoard score = new ScoreBoard(bettor, points);
            scoreBoard.add(score);
        }

        for (ScoreBoard score : scoreBoard) {
            System.out.println(String.format("%s made %d points", score.getBettor().getName(), score.getPoints()));
        }
    }
}
