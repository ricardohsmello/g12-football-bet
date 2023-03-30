package br.com.ricas.service;

import br.com.ricas.domain.model.Bettor;
import br.com.ricas.domain.model.Match;
import br.com.ricas.domain.model.MatchResult;
import br.com.ricas.domain.model.Team;
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

        List<Bettor> bettors = getBettors();

        Match match1 = new Match(1);
        match1.setDate(LocalDateTime.of(2023, 4, 16, 16, 0));
        match1.setMatchStatus(MatchStatus.OPEN);
        match1.setMatchUp(new Team(TeamEnum.PALMEIRAS), new Team(TeamEnum.GREMIO));

        Match match2 = new Match(2);
        match2.setDate(LocalDateTime.of(2023, 4, 16, 16, 0));
        match2.setMatchStatus(MatchStatus.OPEN);
        match2.setMatchUp(new Team(TeamEnum.CORINTHIANS), new Team(TeamEnum.FLAMENGO));

        MatchResult match1Result = new MatchResult();
        match1Result.setMatch(match1);
        match1Result.setResult("1-0");

        MatchResult match2Result = new MatchResult();
        match2Result.setMatch(match2);
        match2Result.setResult("1-0");


        betSystemService = new BetSystemServiceImpl(scoreCalculatorService, extractScoreService);
        betSystemService.calculate(match1Result);
    }

    private static List<Bettor> getBettors() {
        Bettor bettorA = new Bettor(1,"Ricardo");
        Bettor bettorB = new Bettor(2,"Marcelo");
        Bettor bettorC = new Bettor(3,"Antonio");
        Bettor bettorD = new Bettor(4,"Braulio");

        List<Bettor> bettors = new ArrayList<>();
        bettors.add(bettorA);
        bettors.add(bettorB);
        bettors.add(bettorC);
        bettors.add(bettorD);
        return bettors;
    }
}
