import { Component, OnInit } from '@angular/core';
 import { TeamService } from '../../services/team-service/team-service.service';
import { Team } from '../../domain/model/team';
 

@Component({
  selector: 'app-team-list',
  templateUrl: './team-list.component.html',
  styleUrls: ['./team-list.component.scss']
})
export class TeamListComponent implements OnInit {

  teams: Team[];

  constructor(private teamService: TeamService) {
  }

  async ngOnInit() {
    console.log('passando')
    this.teamService.findAll().subscribe(data => {
      console.log(data)
      this.teams = data;
    });
  }
}