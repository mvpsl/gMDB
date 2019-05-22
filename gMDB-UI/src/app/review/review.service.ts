import { Injectable, OnInit  } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import {Router, ActivatedRoute} from '@angular/router';
import { Observable } from 'rxjs';
import { Review } from './review';

@Injectable({
  providedIn: 'root'
})
export class ReviewService {

  constructor(private http: HttpClient,private router: Router, private route: ActivatedRoute,) { }

  // ngOnint(){
  //   let id = +this.route.snapshot.paramMap.get('id');
  // }

  public getReviews(id: number): Observable<any> {
    const url = `https://apigatewaygmdb.herokuapp.com/api/reviews-gmdb-service/getreviewbyMovieId/${id}`;
    console.log("yo");
    return this.http.get(url)
  }
 
}
