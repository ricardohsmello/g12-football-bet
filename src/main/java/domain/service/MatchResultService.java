package domain.service;

import domain.model.Match;
import domain.model.MatchResult;

import java.util.List;

public interface MatchResultService {
    void create(MatchResult matchResult);
    List<MatchResult> findAll();

}
