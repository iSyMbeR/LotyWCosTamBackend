package com.lotywkosmos.lotywkosmos.Service;

import com.lotywkosmos.lotywkosmos.Model.Planet;
import com.lotywkosmos.lotywkosmos.Repository.PlanetRepository;
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
