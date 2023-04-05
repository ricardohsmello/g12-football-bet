package br.com.ricas.infrastructure.repository;

import br.com.ricas.infrastructure.entity.BetEntity;
import br.com.ricas.infrastructure.entity.RoundMatchEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class BetRepository implements PanacheRepositoryBase<BetEntity,Integer> {

    public List<BetEntity> findAllByRoundMatch(List<Integer> roundMatchList) {
        return list("round_match_id", roundMatchList);
    }
}
