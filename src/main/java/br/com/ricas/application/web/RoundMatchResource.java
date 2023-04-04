package br.com.ricas.application.web;

import br.com.ricas.domain.model.RoundMatch;
import br.com.ricas.domain.service.RoundMatchService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/round")
public class RoundMatchResource {

    @Inject
    RoundMatchService roundMatchService;
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String create(RoundMatch roundMatch) {
        roundMatchService.create(roundMatch);
        return "Bet created with successfully";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<RoundMatch> findAll() {
        return roundMatchService.findAll();
    }
}
