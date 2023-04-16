package domain.service.impl;

import domain.model.ScoreBoard;
import domain.service.ScoreBoardService;
import infrastructure.entity.ScoreBoardEntity;
import infrastructure.repository.ScoreBoardRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;


@ApplicationScoped
@Transactional
public class ScoreBoardServiceImpl implements ScoreBoardService {
    @Inject
    ScoreBoardRepository scoreBoardRepository;

    @Override
    public void create(ScoreBoard scoreBoard) {
        scoreBoardRepository.persist(scoreBoard.toEntity());
    }

    @Override
    public List<ScoreBoard> findAll() {
        return scoreBoardRepository.listAll().stream().map(ScoreBoardEntity::toDomain).toList();
    }
}
