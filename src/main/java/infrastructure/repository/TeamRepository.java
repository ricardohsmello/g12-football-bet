package infrastructure.repository;

import infrastructure.entity.TeamEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class TeamRepository implements PanacheRepositoryBase<TeamEntity,Integer> {
}
