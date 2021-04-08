package com.lotywkosmos.lotywkosmos.repository;

import com.lotywkosmos.lotywkosmos.model.Flight;
import com.lotywkosmos.lotywkosmos.model.Ticket;
import com.lotywkosmos.lotywkosmos.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface TicketRepository extends JpaRepository<Ticket, Long> {

    @Query("select t from Ticket t where (t.User.id =:idUser) order by t.bought")
    List<Ticket> getTicketsByUser(@Param("idUser") Long idUser);

    @Query("select t from Ticket t where (t.Flight.id =:idFlight) order by t.bought")
    List<Ticket> getTicketsByFlight(@Param("idFlight") Long idFlight);

    @Query("select count(t) from Ticket t where (t.User.id =:idUser)")
    Long getNumberOfUserTickets(@Param("idUser") Long idUser);

    @Query("select count(t) from Ticket t where (t.Flight.id =:idFlight)")
    Long getNumberOfFlightBoughtTickets(@Param("idFlight") Long idFlight);
}
