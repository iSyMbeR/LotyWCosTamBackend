package com.lotywkosmos.lotywkosmos.Service;

import com.lotywkosmos.lotywkosmos.Model.Flight;
import com.lotywkosmos.lotywkosmos.Model.Port;
import com.lotywkosmos.lotywkosmos.Repository.FlightRepository;
import com.lotywkosmos.lotywkosmos.Repository.PortRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FlightService {
    private final FlightRepository flightRepository;//injection

    public List<Flight> getFlight(){
        return flightRepository.findAll();
    }

    public Flight getSingleFlight(long id) {
        return flightRepository.findById(id)
                .orElseThrow();
    }

    public void addFlightToBase(Flight flight) {
        flightRepository.save(flight);
    }
}
