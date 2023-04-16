package application.web;

import domain.model.Match;
import domain.model.MatchResult;
import domain.service.MatchResultService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/matchResult")
public class MatchResultResource {

    @Inject
    MatchResultService matchResultService;
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String create(MatchResult matchResult) {

        matchResultService.create(matchResult);
        return "Match Result created with successfully";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MatchResult> findAll() {
        return matchResultService.findAll();
    }
}
