package com.lotywkosmos.lotywkosmos.Controllers;

import com.lotywkosmos.lotywkosmos.Model.Planet;
import com.lotywkosmos.lotywkosmos.Model.User;
import com.lotywkosmos.lotywkosmos.Service.PlanetService;
import com.lotywkosmos.lotywkosmos.Service.UserService;
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
