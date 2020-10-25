package com.lotywkosmos.lotywkosmos.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "PLANETS")
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private @Column(unique = true) String name;
    private String description;
    private double distanceFromTheSun;

    public Planet(String name, String description, double distanceFromTheSun) {
        this.name = name;
        this.description = description;
        this.distanceFromTheSun = distanceFromTheSun;
    }
}