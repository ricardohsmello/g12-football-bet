package br.com.ricas.infrastructure.repository;

import br.com.ricas.domain.model.MatchResult;
import br.com.ricas.infrastructure.entity.MatchResultEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MatchResultRepository implements PanacheRepositoryBase<MatchResultEntity,Integer> {
}
