import { Component, OnInit } from '@angular/core';

import {Router, ActivatedRoute} from '@angular/router';
import { MoviesService } from '../movies/movies.service';
import { Movies } from '../movies/movies';
import { ReviewComponent } from '../review/review.component';




@Component({
  selector: 'app-movie-details',
  templateUrl: './movie-details.component.html',
  styleUrls: ['./movie-details.component.css']
})
export class MovieDetailsComponent implements OnInit {
  pageTitle = "Details: "
  movie: Movies;
  constructor(private router: Router, private route: ActivatedRoute, private movieservice: MoviesService) { }

  ngOnInit() {
    let id = +this.route.snapshot.paramMap.get('id');
    this.getMovieById(id);
  }

  getMovieById(id){
    this.movie = this.movieservice.getMovieByID(id);
    
  }

  onBack(): void {
    this.router.navigate(['/movies']);
  }

}
