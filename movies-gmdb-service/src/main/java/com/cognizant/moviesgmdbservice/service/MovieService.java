package com.cognizant.moviesgmdbservice.service;


import com.cognizant.moviesgmdbservice.domain.Movie;
import com.cognizant.moviesgmdbservice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.cognizant.moviesgmdbservice.DTO.movieDTO;

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

    public List<Movie> findMovieById(String imdbid){
        return movieRepository.findMovieModelsByimdbid(imdbid);
    }

    public List<Movie> findByGenre(String genre){
        return (List)movieRepository.findMovieModelsByGenreContains(genre);
    }

    public List<Movie> findByActors(String actors){
        return (List)movieRepository.findMovieModelsByActorsContains(actors);
    }
}
