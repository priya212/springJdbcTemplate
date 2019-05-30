package com.stackroute.springJDBC.domain;

public class Movie {
    private int movieId;
    private String movieName;
    private int releaseYear;
    private  float rating;

    public Movie() {
    }

    public Movie(int movieId, String movieName, int releaseYear, float rating) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", releaseYear=" + releaseYear +
                ", rating=" + rating +
                '}';
    }
}
