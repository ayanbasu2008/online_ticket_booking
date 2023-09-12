package com.sapient.movieservice.repo;

import com.sapient.movieservice.dto.MovieDTO;
import com.sapient.movieservice.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository <Movie, Integer> {


    @Query(
            value = "select m.movie_id as movieId, m.name as name, m.description as description, m.year as year " +
                    "from xyz.movie m join xyz.movie_city mc on m.movie_id=mc.movie_id where mc.city_id=?1",
            nativeQuery = true
    )
    List<MovieDTO> findListOfMoviesByCity(int cityId);
}
