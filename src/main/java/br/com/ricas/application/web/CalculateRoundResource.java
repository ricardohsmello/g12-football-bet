package br.com.ricas.application.web;

import br.com.ricas.domain.model.RoundMatch;
import br.com.ricas.domain.service.CalculateRoundService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/calculate")
public class CalculateRoundResource {

    @Inject
    CalculateRoundService calculateRoundService;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public Long calculate(String roundId) {
        System.out.println("aaaa");
        return Long.parseLong(roundId);
//        return calculateRoundService.calculate(Long.parseLong(roundId));


//        return "Hello from RESTEasy Reactive 2";
    }
}