package br.com.ricas.domain.service.impl;

import br.com.ricas.domain.model.Match;
import br.com.ricas.domain.service.MatchService;
import br.com.ricas.infrastructure.entity.MatchEntity;
import br.com.ricas.infrastructure.repository.MatchRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class MatchServiceImpl implements MatchService {
    @Inject
    MatchRepository matchRepository;

    @Override
    public void create(Match match) {
        matchRepository.persist(match.toEntity());
     }

    @Override
    public List<Match> findAll() {
        return matchRepository.listAll().stream().map(MatchEntity::toDomain).toList();
    }
}
