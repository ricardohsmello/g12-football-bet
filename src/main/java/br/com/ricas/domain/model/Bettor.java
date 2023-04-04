package br.com.ricas.domain.model;

import br.com.ricas.infrastructure.entity.BettorEntity;

public class Bettor {
    private Long id;
    private String name;


    public Bettor(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BettorEntity toEntity() {
        return new BettorEntity(id, name);
    }


}
