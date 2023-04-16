package domain.service;

import domain.model.RoundMatch;

import java.util.List;

public interface RoundMatchService {
    void create(RoundMatch roundMatch);
    List<RoundMatch> findAll();
}
