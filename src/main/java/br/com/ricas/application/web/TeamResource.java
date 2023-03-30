package br.com.ricas.application.web;

import br.com.ricas.domain.model.Team;
import br.com.ricas.domain.service.TeamService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/team")
public class TeamResource {

    @Inject
    TeamService teamService;
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String create(Team team) {

        System.out.println(team.getName());
        System.out.println("teammm");
        teamService.create(team);

        return "Created with successfully";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Team> findAll() {
        return teamService.findAll();
     }
}