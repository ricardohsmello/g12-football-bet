package br.com.ricas.domain.service.impl;

import br.com.ricas.domain.model.RoundMatch;
import br.com.ricas.domain.service.RoundMatchService;
import br.com.ricas.infrastructure.entity.RoundMatchEntity;
import br.com.ricas.infrastructure.repository.RoundMatchRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class RoundMatchServiceImpl implements RoundMatchService {

    @Inject
    RoundMatchRepository roundMatchRepository;

    @Override
    public void create(RoundMatch roundMatch) {
        roundMatchRepository.persist(roundMatch.toEntity());
    }

    @Override
    public List<RoundMatch> findAll() {
        return roundMatchRepository.listAll().stream().map(RoundMatchEntity::toDomain).toList();
    }
}
