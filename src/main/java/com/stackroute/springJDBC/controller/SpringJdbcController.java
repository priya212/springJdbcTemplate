package com.stackroute.springJDBC.controller;

import com.stackroute.springJDBC.domain.Movie;
import com.stackroute.springJDBC.repository.SpringJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class SpringJdbcController {
    @Autowired
    private SpringJdbcRepository springJdbcRepository;

    public SpringJdbcController() {
    }

    public ResponseEntity<String> insertMovie()
    {
        Movie movie=new Movie(1,"Veer Zaara",2013,5);
        springJdbcRepository.addMovie(movie);
        return  new ResponseEntity("Movie Added : "+movie.getMovieName(), HttpStatus.OK);
    }
    public ResponseEntity<?> getAllMovies()
    {
        List<Movie> movie=springJdbcRepository.getAllMovies();
        return  new ResponseEntity<List<Movie>>(movie,HttpStatus.OK);
    }

    public ResponseEntity<String> getMovieById()
    {
        Movie movie=springJdbcRepository.getMovieById(1);
        return  new ResponseEntity("Movie Name is : "+movie.getMovieName(),HttpStatus.OK);
    }
    public ResponseEntity<String> deleteMovieById()
    {
        springJdbcRepository.deleteMovieById(1);
        return new ResponseEntity("Movie Deleted  ",HttpStatus.OK);
    }
    public ResponseEntity<String> updateMovieRatings()
    {
        springJdbcRepository.updateMovieRating("Veer Zaara",5.3f);
        return  new ResponseEntity("Rating Updated ",HttpStatus.OK);
    }
}
