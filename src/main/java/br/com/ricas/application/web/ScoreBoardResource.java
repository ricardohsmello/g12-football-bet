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
        return scoreBoardService.findAll();
    }
}
