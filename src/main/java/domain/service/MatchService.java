package domain.service;

import domain.model.Match;

import java.util.List;

public interface MatchService {
    void create(Match match);
    List<Match> findAll();
}
