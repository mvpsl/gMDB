package com.cognizant.reviewsgmdbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ReviewsGmdbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewsGmdbServiceApplication.class, args);
	}

}
