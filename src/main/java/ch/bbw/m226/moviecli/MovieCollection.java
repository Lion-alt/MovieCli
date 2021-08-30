package ch.bbw.m226.moviecli;

import java.util.List;

public record MovieCollection(List<Movie> movies) {
    public MovieCollection(List<Movie> movies) {
        this.movies = movies;
    }




}
