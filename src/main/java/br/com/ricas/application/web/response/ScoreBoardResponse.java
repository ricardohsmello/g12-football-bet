package br.com.ricas.application.web.response;

public class ScoreBoardResponse {
    private Integer position;
    private String name;
    private Integer points;

    public ScoreBoardResponse(Integer position, String name, Integer points){
        this.position = position;
        this.name = name;
        this.points = points;
    }

    public ScoreBoardResponse(String name, Integer points){
        this.name = name;
        this.points = points;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
