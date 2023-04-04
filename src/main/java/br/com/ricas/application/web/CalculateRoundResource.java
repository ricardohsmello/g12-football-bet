package br.com.ricas.application.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calculate")
public class CalculateRoundResource {

    @GET
    public String calculate() {
        return "Hello from RESTEasy Reactive 2";
    }
}