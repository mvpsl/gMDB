package com.cognizant.moviesgmdbservice.controller;

import com.cognizant.moviesgmdbservice.domain.Movie;
import com.cognizant.moviesgmdbservice.repository.MovieRepository;
import com.cognizant.moviesgmdbservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;
    MovieRepository movieRepository;

    @GetMapping(value="/")
    public String getMovies(){
        return "Movie Service";
    }

//    @GetMapping(value="/movies")
//    public ResponseEntity<List<Movie>> getAllMovies(){
//        System.out.println(movieService.getAllMovies());
//        return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.OK);
//    }
    @GetMapping("/movies")
    public List<Movie> getMovieByTitle(@RequestParam(required = false) String title){
        if(title == null){
            return movieService.getAllMovies();
        }
        else{
            return movieService.findMovieByTitle(title);
        }
    }


}
