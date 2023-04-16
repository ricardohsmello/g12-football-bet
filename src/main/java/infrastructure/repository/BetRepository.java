package infrastructure.repository;

import infrastructure.entity.BetEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

 import java.util.List;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class BetRepository implements PanacheRepositoryBase<BetEntity,Integer> {

    public List<BetEntity> findAllByRoundMatch(List<Integer> roundMatchList) {
        return list("round_match_id", roundMatchList);
    }
}
