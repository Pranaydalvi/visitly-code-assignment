import { Component } from '@angular/core';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
})
export class AddUserComponent {
  user = { name: '', email: '' };

  onSubmit() {
    console.log('User submitted:', this.user);
  }
}
