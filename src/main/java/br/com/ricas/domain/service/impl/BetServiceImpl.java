package br.com.ricas.domain.service.impl;

import br.com.ricas.domain.model.Bet;
import br.com.ricas.domain.service.BetService;
import br.com.ricas.infrastructure.entity.BetEntity;
import br.com.ricas.infrastructure.repository.BetRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

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
