package br.com.ricas.domain.service.impl;

import br.com.ricas.domain.service.ExtractScoreService;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ExtractScoreServiceImpl implements ExtractScoreService {
    @Override
    public int[] extractScores(String scoreString) {
        String[] scoreParts = scoreString.split("-");
        int[] scores = new int[2];
        scores[0] = Integer.parseInt(scoreParts[0]);
        scores[1] = Integer.parseInt(scoreParts[1]);
        return scores;
    }
}
