package br.com.ricas.infrastructure.repository;

import br.com.ricas.infrastructure.entity.ScoreBoardEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ScoreBoardRepository implements PanacheRepositoryBase<ScoreBoardEntity,Integer> {

}
