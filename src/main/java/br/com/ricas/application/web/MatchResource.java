package br.com.ricas.application.web;

import br.com.ricas.domain.model.Match;
import br.com.ricas.domain.service.MatchService;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/match")
public class MatchResource {

    @Inject
    MatchService matchService;
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String create(Match match) {
//        System.out.println(match.getTeamA().getName());
//        System.out.println(match.getTeamB().getName());
//        System.out.println(match.getMatchStatus().ordinal());
//        System.out.println(match.getDate());
//
//        return "Match created with successfully";
////
////        System.out.println("aq");
                System.out.println(match.getTeamA().getId());

        matchService.create(match);
        return "Match created with successfully";
    }
}
