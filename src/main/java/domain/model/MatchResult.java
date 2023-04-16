package domain.model;

import infrastructure.entity.MatchResultEntity;

public class MatchResult {
    private Long id;
    private Match match;
    private String result;

    public void setMatch(Match match) {
        this.match = match;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Match getMatch() {
        return match;
    }

    public String getResult() {
        return result;
    }

    public Long getId() {
        return id;
    }

    public MatchResultEntity toEntity() {
        return new MatchResultEntity(
               match.toEntity(), result
        );
    }

    public MatchResult(Long id, Match match, String result) {
        this.id = id;
        this.match = match;
        this.result = result;
    }
}
