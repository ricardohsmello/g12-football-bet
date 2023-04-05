package br.com.ricas.service;

import br.com.ricas.domain.model.Bettor;
import br.com.ricas.domain.model.Match;
import br.com.ricas.domain.model.MatchResult;
import br.com.ricas.domain.model.Team;
import br.com.ricas.domain.service.BetSystemService;
import br.com.ricas.domain.service.ExtractScoreService;
import br.com.ricas.domain.service.ScoreCalculatorService;
import br.com.ricas.domain.service.impl.ExtractScoreServiceImpl;
import br.com.ricas.domain.service.impl.ScoreCalculatorServiceImpl;
import br.com.ricas.domain.util.MatchStatus;
import br.com.ricas.domain.util.TeamEnum;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
