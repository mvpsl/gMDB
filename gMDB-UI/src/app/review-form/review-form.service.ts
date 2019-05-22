import { Injectable } from '@angular/core';
import { Review } from '../review/review';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ReviewFormService {

  private url: string;

  constructor(private http: HttpClient) { 
    this.url = "https://apigatewaygmdb.herokuapp.com/api/review-gmdb-service/create-review"
  }

  // review(review: Review): Observable<any> {
    
  //   let ourheaders = new HttpHeaders()
  //   ourheaders.append('Content-Type', 'application/json'); 
  //   return this.http.post(url, review, {headers :ourheaders});  
  // }
  public review(review: Review){
    console.log(review);
    
    return this.http.post<Review>(this.url, review);
  }
}
