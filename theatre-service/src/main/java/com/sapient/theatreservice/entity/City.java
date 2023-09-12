package com.sapient.theatreservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity (name = "CITY")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class City {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "CITY_ID")
    private Integer cityId;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "pin")
    private String pin;

    @ManyToMany (cascade = CascadeType.ALL)
    @JoinTable (
            name = "MOVIE_CITY",
            joinColumns = @JoinColumn (name = "CITY_ID"),
            inverseJoinColumns = @JoinColumn (name = "MOVIE_ID")
    )
    private Set<Theatre> movies;



}
