package domain.service.impl;

import domain.model.Match;
import domain.service.MatchService;
import infrastructure.entity.MatchEntity;
import infrastructure.repository.MatchRepository;

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
