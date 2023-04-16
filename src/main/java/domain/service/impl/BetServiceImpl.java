package domain.service.impl;

import domain.model.Bet;
import domain.service.BetService;
import infrastructure.entity.BetEntity;
import infrastructure.repository.BetRepository;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
@Transactional
public class BetServiceImpl implements BetService {

    @Inject
    BetRepository betRepository;

    @Override
    public void create(Bet bet) {
        betRepository.persist(bet.toEntity());
     }

    @Override
    public List<Bet> findAll() {
        return betRepository.listAll().stream().map(BetEntity::toDomain).toList();
    }
}
