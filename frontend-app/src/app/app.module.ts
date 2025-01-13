import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms'; // Add FormsModule here
import { CommonModule } from '@angular/common'; // Add CommonModule here
import { AppComponent } from './app.component';
import { UserListComponent } from './user-list/user-list.component';
import { AddUserComponent } from './add-user/add-user.component';
import { AppRoutingModule } from './app-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,  // Declare UserListComponent here
    AddUserComponent,   // Declare AddUserComponent here
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,        // Ensure FormsModule is imported for ngModel and ngForm
    CommonModule,       // Ensure CommonModule is imported for *ngFor
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
