package application.web;

import domain.model.Team;
import domain.service.TeamService;

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
    @Produces(MediaType.TEXT_PLAIN)
    public String create(Team team) {
        teamService.create(team);
        return "Team created with successfully";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Team> findAll() {
        return teamService.findAll();
     }
}