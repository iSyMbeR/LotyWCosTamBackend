package com.lotywkosmos.lotywkosmos.service;

import com.lotywkosmos.lotywkosmos.model.Flight;
import com.lotywkosmos.lotywkosmos.repository.FlightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FlightService {
    private final FlightRepository flightRepository;//injection

    public List<Flight> getFlight() {
        return flightRepository.findAll();
    }

    public Flight getSingleFlight(long id) {
        return flightRepository.findById(id)
                .orElseThrow();
    }

    public void addFlightToBase(Flight flight) {
        flightRepository.save(flight);
    }

    public List<Flight> getFilterFlight(String startingPortName, String endingPortName, Double startPrice, Double endPrice, String startDate, String endDate) {
        return flightRepository.getAllByStart_dateAndEnd_date(startingPortName, endingPortName, startPrice, endPrice, LocalDate.parse(startDate), LocalDate.parse(endDate));
    }
}

