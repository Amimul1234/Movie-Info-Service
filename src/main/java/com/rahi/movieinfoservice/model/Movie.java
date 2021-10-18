package com.rahi.movieinfoservice.model;

/**
 * @Author Amimul Ehsan
 * @Created at 10/17/21
 * @Project Movie Info Service
 */

public class Movie {

    private String movieId;
    private String name;

    public Movie() {
    }

    public Movie( String movieId, String name ) {
        this.movieId = movieId;
        this.name = name;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId( String movieId ) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }
}
