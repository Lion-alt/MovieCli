package ch.bbw.m226.moviecli;

import java.util.List;

public record MovieColletion(List<Movie> movies) {
    public MovieColletion(List<Movie> movies) {
        this.movies = movies;
    }
}
