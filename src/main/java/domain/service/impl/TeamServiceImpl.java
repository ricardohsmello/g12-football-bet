package domain.service.impl;

import domain.model.Team;
import domain.service.TeamService;
import infrastructure.entity.TeamEntity;
import infrastructure.repository.TeamRepository;

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
