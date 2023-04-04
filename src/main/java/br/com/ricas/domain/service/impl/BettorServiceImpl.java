package br.com.ricas.domain.service.impl;

import br.com.ricas.domain.model.Bettor;
import br.com.ricas.domain.service.BettorService;
import br.com.ricas.infrastructure.entity.BettorEntity;
import br.com.ricas.infrastructure.repository.BettorRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class BettorServiceImpl implements BettorService {

    @Inject
    BettorRepository bettorRepository;

    @Override
    public void create(Bettor bettor) {
        bettorRepository.persist(bettor.toEntity());
     }

    @Override
    public List<Bettor> findAll() {
        return bettorRepository.listAll().stream().map(BettorEntity::toDomain).toList();
    }
}
