package br.com.ricas.domain.service;

import br.com.ricas.domain.model.RoundMatch;

import java.util.List;

public interface RoundMatchService {
    void create(RoundMatch roundMatch);
    List<RoundMatch> findAll();
}
