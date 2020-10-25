package com.lotywkosmos.lotywkosmos.Repository;

import com.lotywkosmos.lotywkosmos.Model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
}
