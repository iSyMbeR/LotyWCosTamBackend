package com.lotywkosmos.lotywkosmos.repository;

import com.lotywkosmos.lotywkosmos.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Repository
@EnableJpaRepositories
public interface FlightRepository extends JpaRepository<Flight, Long> {

    @Transactional
    @Modifying
    @Query("select f from Flight f where (f.portLink.StartingPort.name =:startingPortName) " +
            "AND (f.portLink.EndPort.name =:endingPortName) " +
            "AND (f.start_date >=:startDate) " +
            "AND (f.end_date <=:endDate) " +
            "AND (f.ticketPrice between :startPrice and :endPrice)")
    List<Flight> getAllByStart_dateAndEnd_date(@Param("startingPortName") String startingPortName, @Param("endingPortName") String endingPortName,
                                               @Param("startPrice") Double startPrice, @Param("endPrice") Double endPrice, @Param("startDate") LocalDate startDate,
                                               @Param("endDate") LocalDate endDate);

}
