package br.com.ricas.domain.service;

import br.com.ricas.domain.model.RoundMatch;

public interface CalculateRoundService {
    RoundMatch calculate(Long roundId);
}
