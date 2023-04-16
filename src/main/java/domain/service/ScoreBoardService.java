package domain.service;

import domain.model.ScoreBoard;

import java.util.List;

public interface ScoreBoardService {
    void create(ScoreBoard scoreBoard);
    List<ScoreBoard> findAll();
}
