import { Routes } from '@angular/router';

import { DashboardComponent } from '../../dashboard/dashboard.component';
import { UserProfileComponent } from '../../user-profile/user-profile.component';
import { NotificationsComponent } from '../../notifications/notifications.component';
import { ScoreBoardComponent } from '../../score-board/score-board.component';
import { TeamListComponent } from '../../team-list/team-list.component';


export const AdminLayoutRoutes: Routes = [
    { path: 'dashboard',      component: DashboardComponent },
    { path: 'user-profile',   component: UserProfileComponent },
    { path: 'notifications',  component: NotificationsComponent },
    { path: 'scoreboard',  component: ScoreBoardComponent },
    { path: 'teams',  component: TeamListComponent },
];
