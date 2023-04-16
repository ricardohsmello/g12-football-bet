package infrastructure.repository;

import infrastructure.entity.MatchResultEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;


import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class MatchResultRepository implements PanacheRepositoryBase<MatchResultEntity,Integer> {
}
