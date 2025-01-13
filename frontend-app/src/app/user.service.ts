import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private baseUrl = 'http://localhost:8983/api/users'; // Your backend base URL

  constructor(private http: HttpClient) { }

  getAllUsers(): Observable<any> {
    return this.http.get(`${this.baseUrl}/allusers`);
  }

  addUser(user: any): Observable<any> {
    return this.http.post(`${this.baseUrl}/adduser`, user);
  }
}
