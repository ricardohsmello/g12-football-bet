package br.com.ricas.domain.service;

import br.com.ricas.domain.model.Match;

import java.util.List;

public interface MatchService {
    void create(Match match);
    List<Match> findAll();
}
