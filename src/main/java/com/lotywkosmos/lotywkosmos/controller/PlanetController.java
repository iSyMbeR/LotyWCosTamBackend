package com.lotywkosmos.lotywkosmos.controller;

import com.lotywkosmos.lotywkosmos.model.Planet;
import com.lotywkosmos.lotywkosmos.service.PlanetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PlanetController {


    private final PlanetService planetService;

    @GetMapping("/planets")
    public List<Planet> getUsers(){
        return planetService.getPlanets();
    }

    @GetMapping("/planets/{id}")
    public Planet getSingleUser(@PathVariable long id) {
        return planetService.getSinglePlanet(id);
    }
}
