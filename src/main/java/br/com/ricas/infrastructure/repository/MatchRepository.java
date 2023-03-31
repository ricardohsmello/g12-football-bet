package br.com.ricas.infrastructure.repository;

import br.com.ricas.infrastructure.entity.MatchEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MatchRepository implements PanacheRepositoryBase<MatchEntity,Integer> {
}
