import { Component, OnInit, Input } from '@angular/core';
import { Movies } from '../movies/movies';
import { reviews } from './mock_review';
import { data } from '../movies/data';
import  { Review } from './review';
import {Router, ActivatedRoute} from '@angular/router';
import { MoviesService } from '../movies/movies.service';
import { ReviewService } from './review.service';

@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.css']
})
export class ReviewComponent implements OnInit {
  @Input() reviews : [Review];
  Movies: any[];
  id: number;
  
  constructor(private router: Router, private route: ActivatedRoute, private reviewService: ReviewService) { }

  ngOnInit() {
    let id = +this.route.snapshot.paramMap.get('id');
    this.reviewService.getReviews(id).subscribe(resp => {
      this.reviews = resp;
    });

  }
}
