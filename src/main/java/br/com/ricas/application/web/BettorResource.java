package br.com.ricas.application.web;

import br.com.ricas.domain.model.Bettor;
import br.com.ricas.domain.service.BettorService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/bettor")
public class BettorResource {

    @Inject
    BettorService bettorService;
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String create(Bettor bettor) {
        bettorService.create(bettor);
        return "Bettor created with successfully";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bettor> findAll() {
        return bettorService.findAll();
    }
}
