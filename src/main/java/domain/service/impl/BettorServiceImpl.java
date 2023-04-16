package domain.service.impl;

import domain.model.Bettor;
import domain.service.BettorService;
import infrastructure.entity.BettorEntity;
import infrastructure.repository.BettorRepository;

 import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;


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
