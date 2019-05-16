import { Injectable } from '@angular/core';
import { User } from '../user';
import {HttpClient, HttpHeaders} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class SignupService {


  constructor(private http: HttpClient) { }


  signup(user: User) {
    const url = "http://localhost:8080/createuser"
    
    let ourheaders = new HttpHeaders()
    ourheaders.append('Content-Type', 'application/json');
    
    this.http.post(url, user, {headers: ourheaders})
    .subscribe(data => {
      console.log(data);
    })

  }
}
