package br.com.ricas.domain.service.impl;

import br.com.ricas.domain.model.Match;
import br.com.ricas.domain.service.MatchService;
import br.com.ricas.infrastructure.repository.MatchRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class MatchServiceImpl implements MatchService {

    @Inject
    MatchRepository matchRepository;

    @Override
    public void create(Match match) {
        matchRepository.persist(match.toEntity());
     }
}
