package com.lotywkosmos.lotywkosmos.Controllers;

import com.lotywkosmos.lotywkosmos.Model.Flight;
import com.lotywkosmos.lotywkosmos.Model.PortLink;
import com.lotywkosmos.lotywkosmos.Service.FlightService;
import com.lotywkosmos.lotywkosmos.Service.PortLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FlightController {


    private final FlightService flightService;

    @GetMapping("/flights")
    public List<Flight> getPortLinks(){
        return flightService.getFlight();
    }

    @GetMapping("/flights/{id}")
    public Flight getSingleFlight(@PathVariable long id) {
        return flightService.getSingleFlight(id);
    }
}
