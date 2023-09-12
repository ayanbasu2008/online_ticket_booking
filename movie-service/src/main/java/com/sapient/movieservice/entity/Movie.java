package com.sapient.movieservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity (name = "MOVIE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "MOVIE_ID")
    private Integer movieId;
    @Column (name = "NAME")
    private String name;
    @Column (name = "YEAR")
    private Integer year;
    @Column (name = "DESCRIPTION")
    private String description;

    @ManyToMany (mappedBy = "movies")
    @JsonIgnore
    private Set<City> cities;
}
