package com.rahi.movieinfoservice.controller;

import com.rahi.movieinfoservice.model.Movie;
import com.rahi.movieinfoservice.model.MovieSummary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Amimul Ehsan
 * @Created at 10/17/21
 * @Project Movie Info Service
 */

@RestController
@RequestMapping("movies")
public class MovieResource {

    @Value("${api.key}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public MovieResource( RestTemplate restTemplate ) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("{movieId}")
    public Movie getMovieInfo( @PathVariable("movieId") String movieId ) {

        MovieSummary movieSummary = restTemplate.getForObject(
                "https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey,
                MovieSummary.class
        );

        assert movieSummary != null;
        return new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview());
    }

}
