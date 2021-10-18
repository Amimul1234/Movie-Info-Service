package com.rahi.movieinfoservice.controller;

import com.rahi.movieinfoservice.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Amimul Ehsan
 * @Created at 10/17/21
 * @Project Movie Info Service
 */

@RestController
@RequestMapping("movies")
public class MovieResource {

    @GetMapping("{movieId}")
    public Movie getMovieInfo( @PathVariable("movieId") String movieId ) {
        return new Movie(movieId, "Test name");
    }

}
