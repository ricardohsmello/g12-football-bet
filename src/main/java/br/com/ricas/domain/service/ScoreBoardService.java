package br.com.ricas.domain.service;

import br.com.ricas.domain.model.ScoreBoard;

import java.util.List;

public interface ScoreBoardService {
    void create(ScoreBoard scoreBoard);
    List<ScoreBoard> findAll();
}
