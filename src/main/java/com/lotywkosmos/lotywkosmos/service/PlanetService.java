package com.lotywkosmos.lotywkosmos.service;

import com.lotywkosmos.lotywkosmos.model.Planet;
import com.lotywkosmos.lotywkosmos.repository.PlanetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlanetService {
    private final PlanetRepository planetRepository;//injection

    public List<Planet> getPlanets(){
        return planetRepository.findAll();
    }

    public Planet getSinglePlanet(long id) {
        return planetRepository.findById(id)
                .orElseThrow();
    }

    public void addPlanetToBase(Planet planet) {
        planetRepository.save(planet);
    }
}
