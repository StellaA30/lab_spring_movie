package com.example.lab_spring_cinema.services;

import com.example.lab_spring_cinema.models.Movie;
import com.example.lab_spring_cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;
    private Movie movie;

    public MovieService(){

    }

    public List<Movie> getAllMovies(){
        return  movieRepository.findAll();
    }



    public void saveMovie(Movie movie) {
        movieRepository.save(movie);
    }

    public Optional<Movie> getMovieById(int id) {
        return movieRepository.findById(id);
    }


// GETTERS and SETTERS
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
