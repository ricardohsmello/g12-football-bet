package br.com.ricas.domain;

import br.com.ricas.domain.model.*;
import br.com.ricas.domain.service.BetSystemService;
import br.com.ricas.domain.service.ExtractScoreService;
import br.com.ricas.domain.service.ScoreCalculatorService;
import br.com.ricas.domain.service.impl.BetSystemServiceImpl;
import br.com.ricas.domain.service.impl.ExtractScoreServiceImpl;
import br.com.ricas.domain.service.impl.ScoreCalculatorServiceImpl;
import br.com.ricas.domain.util.MatchStatus;
import br.com.ricas.domain.util.TeamEnum;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BetTest {

    ScoreCalculatorService scoreCalculatorService;
    ExtractScoreService extractScoreService;
    BetSystemService betSystemService;

    @BeforeAll
    public void instance() {
        scoreCalculatorService = new ScoreCalculatorServiceImpl();
        extractScoreService = new ExtractScoreServiceImpl();
    }

    @Test
    public void shouldCreateGameSuccessfully() {

        Bettor bettorA = new Bettor("Ricardo", "2-3"); // 10
        Bettor bettorB = new Bettor("Marcelo", "4-4"); // 0
        Bettor bettorC = new Bettor("Antonio", "2-2"); //0
        Bettor bettorD = new Bettor("Braulio", "1-1");// 5

        List<Bettor> bettors = new ArrayList<>();
        bettors.add(bettorA);
        bettors.add(bettorB);
        bettors.add(bettorC);
        bettors.add(bettorD);


        Team corinthians = new Team(TeamEnum.CORINTHIANS);
        Team flamengo = new Team(TeamEnum.FLAMENGO);
        List<Team> teams = new ArrayList<>();
        teams.add(corinthians);
        teams.add(flamengo);


        Match match = new Match();
        match.setDate(LocalDateTime.of(2023, 4, 16, 16, 0));
        match.setMatchStatus(MatchStatus.OPEN);
        match.setTeams(teams);
        match.setBettors(bettors);

        MatchResult matchResult = new MatchResult();
        matchResult.setMatch(match);
        matchResult.setResult("2-3");

        betSystemService = new BetSystemServiceImpl(scoreCalculatorService, extractScoreService);
        betSystemService.calculate(matchResult);
    }
}
