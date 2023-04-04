package br.com.ricas.application.web;

import br.com.ricas.domain.model.Bet;
import br.com.ricas.domain.service.BetService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;
import java.util.List;

@Path("/bet")
public class BetResource {

    @Inject
    BetService betService;
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String create(Bet bet) {
        betService.create(bet);
        return "Bet created with successfully";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bet> findAll() {
        return betService.findAll();
    }
}
