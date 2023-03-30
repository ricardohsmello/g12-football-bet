package br.com.ricas.domain.model;

public class Bettor {
    private int id;
    private String name;


    public Bettor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
