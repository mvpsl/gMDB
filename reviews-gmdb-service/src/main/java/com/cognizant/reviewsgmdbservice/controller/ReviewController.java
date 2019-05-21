package com.cognizant.reviewsgmdbservice.controller;


import com.cognizant.reviewsgmdbservice.domain.Review;
import com.cognizant.reviewsgmdbservice.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping(value = "/create-review")
    public ResponseEntity<Review> createReview(@RequestBody Review review) {

       Review reviewResponse = reviewService.createReview(review);

       return new ResponseEntity<>(reviewResponse, HttpStatus.OK);
    }


    @GetMapping(value = "/getreviewbyMovieId/{id}")
    public ResponseEntity<List<Review>> getReviewsByMovieId(@PathVariable("id") long id){

        return new ResponseEntity<>(reviewService.getReviewsByMovieId(id), HttpStatus.OK);
    }

    @PutMapping(value = "/update-review")
    public ResponseEntity<Review> updateReview(@RequestBody Review review) {
        Review reviewResponse = reviewService.updateReview(review);
        return new ResponseEntity<>(reviewResponse, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete-review")
    public ResponseEntity<Boolean> deleteReview(@RequestBody Review review) {
       reviewService.deleteReview(review);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete-review/{id}")
    public ResponseEntity<Boolean> deleteReviewById(@PathVariable("id") long id) {
        reviewService.deleteReviewById(id);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

}
