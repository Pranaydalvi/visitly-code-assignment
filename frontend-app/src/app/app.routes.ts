import { Routes } from '@angular/router';
import { AddUserComponent } from './add-user/add-user.component';
import { UserListComponent } from './user-list/user-list.component';

export const routes: Routes = [
  { path: 'add-user', component: AddUserComponent },
  { path: 'user-list', component: UserListComponent },
  { path: '', redirectTo: '/user-list', pathMatch: 'full' },
];
