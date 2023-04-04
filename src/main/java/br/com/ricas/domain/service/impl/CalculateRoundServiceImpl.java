package br.com.ricas.domain.service.impl;

import br.com.ricas.domain.model.RoundMatch;
import br.com.ricas.domain.service.CalculateRoundService;
import br.com.ricas.infrastructure.repository.RoundMatchRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class CalculateRoundServiceImpl implements CalculateRoundService {

    @Inject
    RoundMatchRepository roundMatchRepository;

    public RoundMatch calculate(Long roundId) {

        return roundMatchRepository.findById(roundId.intValue()).toDomain();


    }
}
