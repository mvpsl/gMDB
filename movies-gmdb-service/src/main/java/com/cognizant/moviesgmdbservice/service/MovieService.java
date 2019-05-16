package com.cognizant.moviesgmdbservice.service;


import com.cognizant.moviesgmdbservice.domain.Movie;
import com.cognizant.moviesgmdbservice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;


    public List<Movie> getAllMovies(){
        return (List)movieRepository.findAll();
    }

//    public MovieService(MovieRepository movieRepository) {
//        this.movieRepository = movieRepository;
//    }
    public List<Movie> findMovieByTitle(String title){
        return movieRepository.findMovieModelsByTitleContains(title);
    }
}
