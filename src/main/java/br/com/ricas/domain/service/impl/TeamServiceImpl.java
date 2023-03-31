package br.com.ricas.domain.service.impl;

import br.com.ricas.domain.model.Team;
import br.com.ricas.domain.service.TeamService;
import br.com.ricas.infrastructure.entity.TeamEntity;
import br.com.ricas.infrastructure.repository.TeamRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class TeamServiceImpl implements TeamService {
    @Inject
    TeamRepository teamRepository;
    @Override
    public void create(Team team) {
        teamRepository.persist(team.toEntity());
    }

    @Override
    public List<Team> findAll() {
        return teamRepository.listAll().stream().map(
                TeamEntity::toDomain
        ).toList();
    }
}
