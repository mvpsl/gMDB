package com.cognizant.moviesgmdbservice.controllers;

import com.cognizant.moviesgmdbservice.controller.MovieController;
import com.cognizant.moviesgmdbservice.repository.MovieRepository;
import com.cognizant.moviesgmdbservice.service.MovieService;
import org.assertj.core.internal.bytebuddy.matcher.ElementMatchers;
import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

//import static com.sun.tools.doclint.Entity.and;
//import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
//import static org.hamcrest.Matchers.is;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.asyncDispatch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MovieControllerTests {

    @Autowired
    MovieService movieService;

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    MovieController movieController;

    @Autowired
    MockMvc mvc;

    @Test
    public void getMoviesTests() throws Exception {
        mvc.perform(get("/").contentType(MediaType.ALL))
                .andExpect(status().isOk());
    }
//
//    @Test
//    public void getMovieByTitleTests() throws Exception {
//        String title = "";
//        mvc.perform(get("movies?title=Guardian"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
////                .andExpect(jsonPath("$[0].title", has(title)));
//
////        System.out.println(mvc.perform(get("movies?title=Guardian")).);
//
//
//    }
}
