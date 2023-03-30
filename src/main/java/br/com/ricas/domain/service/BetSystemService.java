package br.com.ricas.domain.service;

import br.com.ricas.domain.model.MatchResult;

public interface BetSystemService {
    void calculate(MatchResult matchResult);
}
