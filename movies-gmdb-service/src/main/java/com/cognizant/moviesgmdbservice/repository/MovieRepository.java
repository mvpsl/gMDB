package com.cognizant.moviesgmdbservice.repository;

import com.cognizant.moviesgmdbservice.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {
    List<Movie> findMovieModelsByTitleContains(String criteria);


}
