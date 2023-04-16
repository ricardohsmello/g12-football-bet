package infrastructure.repository;

import infrastructure.entity.BettorEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class BettorRepository implements PanacheRepositoryBase<BettorEntity,Integer> {
}
