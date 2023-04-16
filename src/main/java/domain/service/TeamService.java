package domain.service;

import domain.model.Team;

import java.util.List;

public interface TeamService {

   void create(Team team);
   List<Team> findAll();
}
