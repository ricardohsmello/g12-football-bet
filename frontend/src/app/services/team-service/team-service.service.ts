import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { Team } from '../../team';

@Injectable({
  providedIn: 'root'
})
export class TeamService {

  private teamUrl: string;

  constructor(private http: HttpClient) {
    this.teamUrl = 'http://localhost:8080/team';
  }

  public findAll(): Observable<Team[]> {
    return this.http.get<Team[]>(this.teamUrl);
  }

  // public save(user: User) {
  //   return this.http.post<User>(this.usersUrl, user);
  // }
}