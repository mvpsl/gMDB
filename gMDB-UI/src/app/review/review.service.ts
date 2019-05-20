import { Injectable, OnInit  } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import {Router, ActivatedRoute} from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class ReviewService {

  constructor(private http: HttpClient,private router: Router, private route: ActivatedRoute,) { }

  // ngOnint(){
  //   let id = +this.route.snapshot.paramMap.get('id');
  // }

  public getReviews(id: string): void {
    const url = "http://localhost:8090/api/reviews-gmdb-service/getreviewbyMovieId/{id}";
    this.http.get(url, { 
      params: id
    })
    .subscribe(data => {
      console.log(data);
    })
  }
 
}
