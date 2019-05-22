import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Review } from '../review/review';
import { reviews } from '../review/mock_review';
import { ReviewFormService} from './review-form.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-review-form',
  templateUrl: './review-form.component.html',
  styleUrls: ['./review-form.component.css']
})
export class ReviewFormComponent implements OnInit {
  reviewform: FormGroup;
  rev: Review;
  constructor(private route: ActivatedRoute,private router: Router,private formbuilder: FormBuilder, private reviewformservice: ReviewFormService) { }

  ngOnInit() {
    this.reviewform = this.formbuilder.group({
      reviewtext:[''],
      reviewtitle:['']
      
    })
  }
  // review(){
  //   console.log("in the review");
    
  //   const review = new Review();
  //   review.reviewText = this.reviewform.value.reviewtext;
  //   review.reviewTitle = this.reviewform.value.reviewtitle;
    
  //   this.reviewformservice.review(review).subscribe(rev => {
  //     if(rev == null){
  //       alert("Empty fields not allowed");
  //       console.log("empty fields");
        
  //     } else {
  //       console.log("my review is", rev);
        
  //     }
  //   });
  //   this.reviewformservice.review(review);
  // }

  review(){
    console.log("review");
    const review = new Review();
    review.review = this.reviewform.value.reviewtext;
    review.movieid = 1;
    review.userid = 1;
    console.log(review);
    reviews.push(review);


  review(){
   this.reviewformservice.review(this.rev).subscribe(r => this.revList());
  }

  revList(){
    this.router.navigate(['/movies']);
  }
  
}
