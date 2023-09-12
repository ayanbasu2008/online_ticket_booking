package com.sapient.movieservice.controller;

import com.sapient.movieservice.dto.MovieDTO;
import com.sapient.movieservice.entity.Movie;
import com.sapient.movieservice.repo.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;

    @PostMapping ("/movie")
    public String createMovie (@RequestBody Movie movie) {
        movieRepository.save(movie);
        return "Movie saved successfully";
    }

    @GetMapping ("/movie/all")
    public List<Movie> getAllMovies () {
        return movieRepository.findAll();
    }

    @GetMapping ("/movie")
    public Optional<Movie> getById (@RequestParam (name = "id") int id) {
        return movieRepository.findById(id);
    }

    @GetMapping ("/movies")
    public List<MovieDTO> getListOfMoviesByCity(@RequestParam (name = "cityId") int cityId) {
        System.out.println("inside getListOfMoviesByCity method");
        return movieRepository.findListOfMoviesByCity(cityId);

    }

}
