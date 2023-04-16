package infrastructure.repository;

import infrastructure.entity.MatchEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;


import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class MatchRepository implements PanacheRepositoryBase<MatchEntity,Integer> {
}
