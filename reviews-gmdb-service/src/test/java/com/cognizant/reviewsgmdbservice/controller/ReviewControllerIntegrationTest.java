package com.cognizant.reviewsgmdbservice.controller;


import com.cognizant.reviewsgmdbservice.domain.Review;
import com.cognizant.reviewsgmdbservice.repository.ReviewRepository;
import com.cognizant.reviewsgmdbservice.service.ReviewService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.StatusResultMatchersExtensionsKt;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ReviewController.class)
public class ReviewControllerIntegrationTest {


    @Autowired
    private MockMvc mvc;

    @MockBean
    private ReviewService reviewService;

    @MockBean
    private ReviewController reviewController;

    @MockBean
    private ReviewRepository reviewRepository;



    HttpHeaders headers;
    TestRestTemplate restTemplate;
    Review review;

    @Before
    public void setup(){
        review = new Review();

        review.setId(101);
        review.setMovieid(2);
        review.setUserid(3);
        review.setReview("it's awesome");
        review.setStars(5);


        headers = new HttpHeaders();
        restTemplate = new TestRestTemplate();



//        Mockito.when(reviewController.createReview(review)).thenReturn(new ResponseEntity<>(review, HttpStatus.OK));

    }

    @Test
    public void createReviewTest() throws Exception {



        mvc.perform(post("create-review")
                .content(asJsonString(review))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is(200));

    }

    @Test
    public void getReviewsByMovieIdTest() throws Exception {


        List<Review> allreview = Arrays.asList(review);

        given(reviewController.getReviewsByMovieId(101)).willReturn(new ResponseEntity<>(allreview, HttpStatus.OK));

        mvc.perform(get("/getreviewbyMovieId/101")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].review", is(allreview.get(0).getReview())));
    }


    @Test
    public void updateReviewTest() throws Exception {
//        ResponseEntity<Review> reviewResponseEntity = new ResponseEntity<>(review, HttpStatus.OK);
//
//        given(reviewController.updateReview(review)).willReturn(reviewResponseEntity);
//        mvc.perform(put("update-review")
//                .content(asJsonString(review))
//                .contentType(MediaType.APPLICATION_JSON)
//                .accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect((ResultMatcher) reviewResponseEntity.getBody());
    }

    @Test
    public void deleteReviewById() {
    }

    public static String asJsonString(final Object obj) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            final String jsonContent = mapper.writeValueAsString(obj);
            return jsonContent;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
