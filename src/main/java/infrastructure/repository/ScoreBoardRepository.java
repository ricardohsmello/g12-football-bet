package infrastructure.repository;

import infrastructure.entity.ScoreBoardEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class ScoreBoardRepository implements PanacheRepositoryBase<ScoreBoardEntity, Integer> {
}
