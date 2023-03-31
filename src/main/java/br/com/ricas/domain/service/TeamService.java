package br.com.ricas.domain.service;

import br.com.ricas.domain.model.Team;

import java.util.List;

public interface TeamService {

   void create(Team team);
   List<Team> findAll();
}
