package com.cognizant.moviesgmdbservice.controller;

import com.cognizant.moviesgmdbservice.domain.Movie;
import com.cognizant.moviesgmdbservice.repository.MovieRepository;
import com.cognizant.moviesgmdbservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;
    MovieRepository movieRepository;



    @PostMapping(value= "/createMovie")
    public static ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {

        return new ResponseEntity<Movie>(MovieService.createMovie(movie), HttpStatus.OK);

    }

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

    @GetMapping("/movies/movie")
    public List<Movie> getMovieByImdbId(@RequestParam(required = false) String imdbid){
        if(imdbid == null){
            return movieService.getAllMovies();
        }
        else{
            return movieService.findMovieById(imdbid);
        }
    }


    @GetMapping("/movies/genre")
    public List<Movie> getMovieByGenre(@RequestParam(required = false) String genre){

        System.out.println("yo");
        if(genre == null){
            System.out.println("yhello");
            return movieService.getAllMovies();

        }
        else{
            System.out.println("yello");
            return movieService.findByGenre(genre);

        }
    }


    @GetMapping("/movies/actors")
    public List<Movie> getMovieByActors(@RequestParam(required = false) String actors){

        System.out.println("yo");
        if(actors == null){
            System.out.println("yhello");
            return movieService.getAllMovies();

        }
        else{
            System.out.println("yello");
            return movieService.findByActors(actors);

        }
    }


}
