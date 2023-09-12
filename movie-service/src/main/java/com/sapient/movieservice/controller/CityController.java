package com.sapient.movieservice.controller;

import com.sapient.movieservice.entity.City;
import com.sapient.movieservice.entity.Movie;
import com.sapient.movieservice.repo.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CityController  {

    @Autowired
    private CityRepository cityRepository;

    @PostMapping("/city")
    public String createMovie (@RequestBody City city) {
        cityRepository.save(city);
        return "City saved successfully";
    }

    @GetMapping("/city/all")
    public List<City> getAllCities () {
        return cityRepository.findAll();
    }

    @GetMapping ("/city")
    public Optional<City> getById (@RequestParam(name = "id") int id) {
        return cityRepository.findById(id);
    }

}
