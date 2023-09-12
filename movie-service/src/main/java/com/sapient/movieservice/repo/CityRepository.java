package com.sapient.movieservice.repo;

import com.sapient.movieservice.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {



}
