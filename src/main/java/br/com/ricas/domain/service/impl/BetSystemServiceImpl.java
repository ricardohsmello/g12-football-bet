package br.com.ricas.domain.service.impl;

import br.com.ricas.domain.model.ScoreBoard;
import br.com.ricas.domain.service.BetSystemService;
import br.com.ricas.domain.service.ExtractScoreService;
import br.com.ricas.domain.service.ScoreBoardService;
import br.com.ricas.domain.service.ScoreCalculatorService;
import br.com.ricas.infrastructure.entity.BetInfoViewEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
@Transactional
public class BetSystemServiceImpl implements BetSystemService {
    @Inject
    ExtractScoreService extractScoreService;

    @Inject
    ScoreCalculatorService scoreCalculatorService;

    @Inject
    ScoreBoardService scoreBoardService;
    private final List<ScoreBoard> scoreBoard = new ArrayList<>();

    public BetSystemServiceImpl() {
    }

    @Override
    public void calculateRound(int roundId) {

        List<BetInfoViewEntity> bets = BetInfoViewEntity.findByRound(1);

        bets.forEach(
                this::betSystem
        );

         for (ScoreBoard score : scoreBoard) {
            System.out.println(String.format("%s made %d points", score.getBettor().getName(), score.getPoints()));
        }

    }

    private void betSystem(BetInfoViewEntity betInfo) {
        extractScoreService.extractScores(betInfo.bet);

        int[] matchScores = extractScoreService.extractScores(betInfo.result);
        int[] betScores = extractScoreService.extractScores(betInfo.getBet());
        int points = scoreCalculatorService.calculatePoints(matchScores, betScores);

        ScoreBoard score = new ScoreBoard(betInfo.getBettor().toDomain(), points, betInfo.getMatch().toDomain());
        scoreBoardService.create(score);

        scoreBoard.add(score);

    }
}
