package br.com.ricas.domain.service;

import br.com.ricas.domain.model.Bettor;

import java.util.List;

public interface BettorService {
    void create(Bettor bettor);
    List<Bettor> findAll();
}
