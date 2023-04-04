package br.com.ricas.domain.service;

import br.com.ricas.domain.model.Bet;

import java.util.List;

public interface BetService {
    void create(Bet bet);
    List<Bet> findAll();
}
