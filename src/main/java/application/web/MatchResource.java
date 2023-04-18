package application.web;

import application.web.response.MatchResponse;
import application.web.response.ScoreBoardResponse;
import domain.model.Match;
import domain.service.MatchService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("/match")
public class MatchResource {

    @Inject
    MatchService matchService;
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String create(Match match) {
        matchService.create(match);
        return "Match created with successfully";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Match> findAll() {

        return matchService.findAll();
    }

    @GET
    @Path("/table")
    @Produces(MediaType.APPLICATION_JSON)
    public List<MatchResponse> findMatchTable() {

        return matchService.findAll().stream().map(
                entry -> new MatchResponse(entry.getId().toString(), entry.getTeamA().getName(), entry.getTeamB().getName(),
                        entry.getDate().toString(), entry.getMatchStatus().name()))
                .collect(Collectors.toList());

//        return matchService.findAll();
    }}
