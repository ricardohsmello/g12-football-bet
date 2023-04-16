package domain.service.impl;

import domain.model.RoundMatch;
import domain.service.RoundMatchService;
import infrastructure.entity.RoundMatchEntity;
import infrastructure.repository.RoundMatchRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;


@ApplicationScoped
@Transactional
public class RoundMatchServiceImpl implements RoundMatchService {
    @Inject
    RoundMatchRepository roundMatchRepository;

    public RoundMatchServiceImpl() {
    }

    @Override
    public void create(RoundMatch roundMatch) {
        roundMatchRepository.persist(roundMatch.toEntity());
    }

    @Override
    public List<RoundMatch> findAll() {
        return roundMatchRepository.listAll().stream().map(RoundMatchEntity::toDomain).toList();
    }
}
