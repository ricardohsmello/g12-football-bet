package domain.service;

import domain.model.Bettor;

import java.util.List;

public interface BettorService {
    void create(Bettor bettor);
    List<Bettor> findAll();
}
