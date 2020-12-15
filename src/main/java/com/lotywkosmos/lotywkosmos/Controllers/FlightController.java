package com.lotywkosmos.lotywkosmos.Controllers;

import com.lotywkosmos.lotywkosmos.Model.Flight;
import com.lotywkosmos.lotywkosmos.Model.PortLink;
import com.lotywkosmos.lotywkosmos.Service.FlightService;
import com.lotywkosmos.lotywkosmos.Service.PortLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FlightController {


    private final FlightService flightService;

    @GetMapping("/flights")
    public List<Flight> getPortLinks() {
        return flightService.getFlight();
    }

    @GetMapping("/flights/{id}")
    public Flight getSingleFlight(@PathVariable Long id) {
        return flightService.getSingleFlight(id);
    }

    @GetMapping("/flights/{startingPortName}/{endingPortName}/{startPrice}/{endPrice}/{startDate}/{endDate}")
    public List<Flight> getFilterFlights(@PathVariable String startingPortName, @PathVariable String endingPortName, @PathVariable Double startPrice, @PathVariable Double endPrice,
                                         @PathVariable String startDate, @PathVariable String endDate) {
        return flightService.getFilterFlight(startingPortName, endingPortName, startPrice, endPrice, startDate, endDate);
    }
}
