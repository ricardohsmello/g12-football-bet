package br.com.ricas.application.web;

import br.com.ricas.application.web.response.ScoreBoardResponse;
import br.com.ricas.domain.model.ScoreBoard;
import br.com.ricas.domain.service.ScoreBoardService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Path("/score")
public class ScoreBoardResource {

    @Inject
    ScoreBoardService scoreBoardService;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String create(ScoreBoard scoreBoard) {
        scoreBoardService.create(scoreBoard);
        return "Score board created with successfully";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ScoreBoard> findAll() {
        var result = scoreBoardService.findAll();

        result.stream()
                .collect(Collectors.groupingBy(it -> it.getBettor().getName() +it.getBettor().getId(),
                        Collectors.summingInt(ScoreBoard::getPoints)))
                .forEach((name,sumTargetCost)->System.out.println(name+"\t"+sumTargetCost));


        return result;
    }

    @GET()
    @Path("/table")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ScoreBoardResponse> table() {
        var result = scoreBoardService.findAll();

        List<ScoreBoardResponse> score = result.stream()
                .collect(Collectors.groupingBy(
                        it -> it.getBettor().getName(),
                        Collectors.summingInt(ScoreBoard::getPoints)
                ))
                .entrySet().stream()
                .map(entry -> new ScoreBoardResponse(entry.getKey(), entry.getValue()))
                .sorted(Comparator.comparingInt(ScoreBoardResponse::getPoints).reversed())
                .collect(Collectors.toList());

        IntStream.range(0, score.size())
                .forEach(i -> score.get(i).setPosition(i + 1));

        return score;
    }
}
