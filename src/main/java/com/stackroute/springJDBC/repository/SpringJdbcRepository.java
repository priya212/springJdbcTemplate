package com.stackroute.springJDBC.repository;

import com.stackroute.springJDBC.domain.Movie;
import com.stackroute.springJDBC.mapper.MovieRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class SpringJdbcRepository {
    private JdbcTemplate jdbcTemplate;

    public SpringJdbcRepository() {
    }

    @Autowired
    public void setDataSource(final DataSource dataSource) {
        jdbcTemplate=new JdbcTemplate(dataSource);
    }

    public int addMovie(Movie movie) {
        return  jdbcTemplate.update("insert into movie values(?,?,?,?)",movie.getMovieId(),movie.getMovieName(),
                movie.getReleaseYear(),movie.getRating());
    }

    public List<Movie> getAllMovies()
    {
        return jdbcTemplate.query("select * from movie",new MovieRowMapper());
    }

    public Movie getMovieById(int movieId)
    {
        return  jdbcTemplate.queryForObject("select * from movie where movieId=?",new Object[] {movieId},new MovieRowMapper());
    }
    public int deleteMovieById(int movieId)
    {
        return  jdbcTemplate.update("delete from movie where movieId=?",movieId);
    }
    public int updateMovieRating(String movieName,float rating)
    {
        return jdbcTemplate.update("update movie set rating=? where movieName=?",rating,movieName);
    }
}
