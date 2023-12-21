select * from bettor_entity;
select * from team_entity;
select * from match_entity;
select * from match_result_entity;
select * from round_match_entity;

select * from bet_entity

insert into bettor_entity values (1, 'ricas');
insert into bettor_entity values (2, 'joao');
insert into bettor_entity values (3, 'Braulio');

insert into team_entity values (1, 'Corinthians');
insert into team_entity values (2, 'Flamengo');
insert into team_entity values (3, 'Palmeiras');
insert into team_entity values (4, 'Vasco');

insert into match_entity values (1, now(), 0, 1, 2);
insert into match_entity values (2, now(), 0, 3, 4);

insert into match_result_entity values (1, '2-1', 1);
insert into match_result_entity values (2, '1-0', 2);

insert into round_match_entity values (1, 1, 1);
insert into round_match_entity values (2, 1, 2);

insert into bet_entity values(1, '1-0', 1, 1);
insert into bet_entity values(2, '1-2', 2, 1);
insert into bet_entity values(3, '2-2', 3, 1);

-- jogo 2
insert into bet_entity values(4, '1-3', 1, 2);
insert into bet_entity values(5, '5-2', 2, 2);
insert into bet_entity values(6, '1-1', 3, 2);

select rm.round, b.name bettor, be.bet, mandante."name" home_team, visitante.name visiting_team, mr.result
from bettor_entity b, bet_entity be, match_entity m, round_match_entity rm,
team_entity mandante, team_entity visitante,
match_result_entity mr
where be.bettor_id = b.id
and m.id  = rm.match_id
and mandante.id = m.team1_id
and visitante.id = m.team2_id
and mr.match_id = m.id 
and rm.match_id = be.round_match_id
and rm.round = ?
