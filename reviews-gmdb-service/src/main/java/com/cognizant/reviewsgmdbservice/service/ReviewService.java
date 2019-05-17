package com.cognizant.reviewsgmdbservice.service;

import com.cognizant.reviewsgmdbservice.domain.Review;
import com.cognizant.reviewsgmdbservice.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    public List<Review> getReviewsByMovieId(long id) {

        return reviewRepository.findReviewModelsByMovieId(id);

    }

    public Review updateReview(Review review) {
        return reviewRepository.save(review);
    }

    public void deleteReview(Review review) {
       reviewRepository.delete(review);

    }

    public void deleteReviewById(long id) {
        reviewRepository.deleteById(id);
    }
}
