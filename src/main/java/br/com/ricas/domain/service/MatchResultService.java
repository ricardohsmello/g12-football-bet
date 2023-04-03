package br.com.ricas.domain.service;

import br.com.ricas.domain.model.Match;
import br.com.ricas.domain.model.MatchResult;

import java.util.List;

public interface MatchResultService {
    void create(MatchResult matchResult);
    List<MatchResult> findAll();

}
