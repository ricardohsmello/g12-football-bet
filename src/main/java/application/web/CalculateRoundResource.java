package application.web;

import domain.service.BetSystemService;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/calculate")
public class CalculateRoundResource {

    @Inject
    BetSystemService betSystemService;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String calculate(@QueryParam("roundId") int roundId) {
        betSystemService.calculateRound(roundId);
        return "Round bet calculated!";
    }
}