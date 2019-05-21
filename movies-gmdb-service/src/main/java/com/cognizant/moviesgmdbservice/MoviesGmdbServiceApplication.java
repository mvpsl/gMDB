package com.cognizant.moviesgmdbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class MoviesGmdbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesGmdbServiceApplication.class, args);
	}

}
