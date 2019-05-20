import { Injectable } from '@angular/core';
import { Credential } from '../credential';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Observable } from 'rxjs';
import { User } from '../user';



@Injectable({
  providedIn: 'root'
})
export class LoginService {


  constructor(private http: HttpClient) { }


  login(credential: Credential): Observable<any> {
    const url = "http://localhost:8080/api/login-gmdb-service/login"
    let ourheaders = new HttpHeaders()
    ourheaders.append('Content-Type', 'application/json');
    return this.http.post(url, credential, { headers: ourheaders });
  }


}
