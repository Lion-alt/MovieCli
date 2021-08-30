package ch.bbw.m226.moviecli;

public record Movie(String title, int year, Genre genre) {

    public Movie(String title, int year, Genre genre) {
        if(title == null) {
            throw new IllegalArgumentException("title is missing");
        }
        if(year <= 2022) {
            throw new IllegalArgumentException("year is out of range");
        }
        if(year == 0) {
            throw new IllegalArgumentException("year is out of range");
        }
        if(genre == null) {
            throw new IllegalArgumentException("genre is missing");
        }
        this.title = title;
        this.year = year;
        this.genre = genre;
    }
}
