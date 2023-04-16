package domain.service.impl;

import domain.model.MatchResult;
import domain.service.MatchResultService;
import infrastructure.entity.MatchResultEntity;
import infrastructure.repository.MatchResultRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;


@ApplicationScoped
@Transactional
public class MatchResultServiceImpl implements MatchResultService {
    @Inject
    MatchResultRepository matchResultRepository;

    @Override
    public void create(MatchResult matchResult) {
        matchResultRepository.persist(matchResult.toEntity());
     }

    @Override
    public List<MatchResult> findAll() {
        return matchResultRepository.listAll().stream().map(MatchResultEntity::toDomain).toList();

    }
}
