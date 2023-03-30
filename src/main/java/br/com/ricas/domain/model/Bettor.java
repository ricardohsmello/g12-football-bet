package br.com.ricas.domain.model;

public class Bettor {
    private int id;
    private String name;

    private String bet;

    public Bettor(String name, String bet) {
        this.name = name;
        this.bet = bet;
    }

    public String getName() {
        return name;
    }

    public String getBet() {
        return bet;
    }

}
