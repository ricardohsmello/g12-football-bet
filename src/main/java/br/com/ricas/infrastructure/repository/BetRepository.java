package br.com.ricas.infrastructure.repository;

import br.com.ricas.infrastructure.entity.BetEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BetRepository implements PanacheRepositoryBase<BetEntity,Integer> {
}
