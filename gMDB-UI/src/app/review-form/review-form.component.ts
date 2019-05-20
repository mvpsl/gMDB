import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Review } from '../review/review';
import { reviews } from '../review/mock_review';

@Component({
  selector: 'app-review-form',
  templateUrl: './review-form.component.html',
  styleUrls: ['./review-form.component.css']
})
export class ReviewFormComponent implements OnInit {
  reviewform: FormGroup;
  constructor(private formbuilder: FormBuilder) { }

  ngOnInit() {
    this.reviewform = this.formbuilder.group({
      reviewtext:[''],
      reviewtitle:['']
      
    })
  }
  review(){
    console.log("review");
    const review = new Review();
    review.reviewText = this.reviewform.value.reviewtext;
    review.reviewTitle = this.reviewform.value.reviewtitle;
    console.log(review);
    reviews.push(review);

  }
}
