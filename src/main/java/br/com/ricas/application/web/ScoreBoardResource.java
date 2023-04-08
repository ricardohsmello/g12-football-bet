package br.com.ricas.application.web;

import br.com.ricas.domain.model.ScoreBoard;
import br.com.ricas.domain.service.ScoreBoardService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

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
}
