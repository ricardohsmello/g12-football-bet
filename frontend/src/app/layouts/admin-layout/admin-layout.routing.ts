import { Routes } from '@angular/router';

import { DashboardComponent } from '../../dashboard/dashboard.component';
import { UserProfileComponent } from '../../domain/user-profile/user-profile.component';
import { NotificationsComponent } from '../../notifications/notifications.component';
import { TeamListComponent } from '../../domain/user-profile/team-list/team-list.component';

export const AdminLayoutRoutes: Routes = [
    { path: 'dashboard',      component: DashboardComponent },
    { path: 'user-profile',   component: UserProfileComponent },
    { path: 'notifications',  component: NotificationsComponent },
    { path: 'teams',  component: TeamListComponent },
];
