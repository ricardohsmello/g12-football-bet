package infrastructure.repository;

import infrastructure.entity.RoundMatchEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;


import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class RoundMatchRepository implements PanacheRepositoryBase<RoundMatchEntity, Integer> {
    public void persist(RoundMatchEntity roundMatch) {
        getEntityManager().persist(roundMatch);
    }

}
