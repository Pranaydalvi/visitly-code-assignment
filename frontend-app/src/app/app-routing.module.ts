import { RouterModule } from '@angular/router';
import { routes } from './app.routes';  // Corrected import
import { NgModule } from '@angular/core';

@NgModule({
  imports: [RouterModule.forRoot(routes)],  // Use `routes` here
  exports: [RouterModule]
})
export class AppRoutingModule {}
