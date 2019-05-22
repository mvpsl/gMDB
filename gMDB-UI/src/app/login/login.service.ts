import { Injectable } from '@angular/core';
import { Credential } from '../credential';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';
import { User } from '../user';




@Injectable({
  providedIn: 'root'
})
export class LoginService {
  currentuser: User;
  private currentUser = new BehaviorSubject(this.currentuser);
  sessionuser = this.currentUser.asObservable();

 

  constructor(private http: HttpClient) { }


  login(credential: Credential): Observable<any> {
    // const url = "http://localhost:8080/api/login-gmdb-service/login"
    const url = "https://apigatewaygmdb.herokuapp.com/api/login-gmdb-service/login"
    let ourheaders = new HttpHeaders()
    ourheaders.append('Content-Type', 'application/json');
    return this.http.post(url, credential, { headers: ourheaders });
  }


}
