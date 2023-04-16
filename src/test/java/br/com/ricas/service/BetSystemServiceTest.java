package br.com.ricas.service;


import domain.service.BetSystemService;
import domain.service.ExtractScoreService;
import domain.service.ScoreCalculatorService;
import domain.service.impl.ExtractScoreServiceImpl;
import domain.service.impl.ScoreCalculatorServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BetSystemServiceTest {
    ScoreCalculatorService scoreCalculatorService;
    ExtractScoreService extractScoreService;
    BetSystemService betSystemService;

    @BeforeAll
    public void instance() {
        scoreCalculatorService = new ScoreCalculatorServiceImpl();
        extractScoreService = new ExtractScoreServiceImpl();
    }

    @Test
    public void shouldExecuteWithoutError() {

    }


}
