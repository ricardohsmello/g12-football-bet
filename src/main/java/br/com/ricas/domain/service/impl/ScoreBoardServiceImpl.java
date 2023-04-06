package br.com.ricas.domain.service.impl;

import br.com.ricas.domain.model.ScoreBoard;
import br.com.ricas.domain.service.ScoreBoardService;
import br.com.ricas.infrastructure.entity.ScoreBoardEntity;
import br.com.ricas.infrastructure.repository.ScoreBoardRepository;

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
