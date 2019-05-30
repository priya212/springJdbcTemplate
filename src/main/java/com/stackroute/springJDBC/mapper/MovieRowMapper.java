package com.stackroute.springJDBC.mapper;


import com.stackroute.springJDBC.domain.Movie;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieRowMapper implements RowMapper<Movie> {
    @Override
    public Movie mapRow(ResultSet resultSet, int i) throws SQLException {
        final Movie movie=new Movie();
        movie.setMovieId(resultSet.getInt("movieId"));
        movie.setMovieName(resultSet.getString("movieName"));
        movie.setReleaseYear(resultSet.getInt("releaseYear"));
        movie.setRating(resultSet.getFloat("rating"));
        return movie;
    }
}
