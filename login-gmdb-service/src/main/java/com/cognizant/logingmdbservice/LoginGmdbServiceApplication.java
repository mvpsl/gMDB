package com.cognizant.logingmdbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LoginGmdbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginGmdbServiceApplication.class, args);
	}

}
