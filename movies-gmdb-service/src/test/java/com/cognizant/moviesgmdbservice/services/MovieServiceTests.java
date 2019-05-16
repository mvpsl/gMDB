package com.cognizant.moviesgmdbservice.services;

import com.cognizant.moviesgmdbservice.domain.Movie;
import com.cognizant.moviesgmdbservice.repository.MovieRepository;
import com.cognizant.moviesgmdbservice.service.MovieService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest
@RunWith(SpringRunner.class)
//@TestPropertySource(locations = "classpath:test.properties")
//@ContextConfiguration({"classpath*:spring/applicationContext.xml"})
public class MovieServiceTests {

    @Autowired
    private MovieService movieService;


    public MovieServiceTests() { }



    @Test
    public void getAllMoviesTests(){
        assertNotNull(movieService.getAllMovies());
    }

    @Test
    public void findMovieByTitleTests(){
        Movie movie =  new Movie();
        List<Movie> expectedTitle = movieService.findMovieByTitle("Guardian");
        String actualTitle = "Guardians of the Galaxy Vol. 2";
        assertEquals(expectedTitle.get(0).getTitle(),actualTitle);

    }

}
