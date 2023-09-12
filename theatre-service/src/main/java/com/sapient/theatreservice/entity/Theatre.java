package com.sapient.theatreservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity (name = "THEATRE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Theatre {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "THEATRE_ID")
    private Integer movieId;
    @Column (name = "NAME")
    private String name;
    @Column (name = "YEAR")
    private Integer year;
    @Column (name = "DESCRIPTION")
    private String description;

    @ManyToMany (mappedBy = "movies")
    private Set<City> cities;
}
