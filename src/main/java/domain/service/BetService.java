package domain.service;

import domain.model.Bet;

import java.util.List;

public interface BetService {
    void create(Bet bet);
    List<Bet> findAll();
}
