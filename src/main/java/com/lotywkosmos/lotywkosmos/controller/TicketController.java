package com.lotywkosmos.lotywkosmos.controller;

import com.lotywkosmos.lotywkosmos.model.Flight;
import com.lotywkosmos.lotywkosmos.model.Port;
import com.lotywkosmos.lotywkosmos.model.Ticket;
import com.lotywkosmos.lotywkosmos.service.FlightService;
import com.lotywkosmos.lotywkosmos.service.PortService;
import com.lotywkosmos.lotywkosmos.service.TicketService;
import com.lotywkosmos.lotywkosmos.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TicketController {

    private final TicketService ticketService;
    private final UserService userService;
    private final FlightService flightService;

    @GetMapping("/tickets")
    public List<Ticket> getTickets() {
        return ticketService.getTickets();
    }

    @GetMapping("/tickets/{id}")
    public Ticket getSingleTicket(@PathVariable long id) {
        return ticketService.getSingleTicket(id);
    }

    @GetMapping("/tickets/user/{id}")
    public List<Ticket> getTicketByUserId(@PathVariable long id) {
        return ticketService.getTicketsByUserId(id);
    }
    @GetMapping("/tickets/user/{id}/count")
    public Long getNumberOfUserTickets(@PathVariable long id) {
        return ticketService.getNumberOfUserTickets(id);
    }
    @GetMapping("/tickets/flight/{id}")
    public List<Ticket> getTicketsByFlight(@PathVariable long id) {
        return ticketService.getTicketsByFlight(id);
    }
    @GetMapping("/tickets/flight/{id}/count")
    public Long getNumberOfFlightBoughtTickets(@PathVariable long id) {
        return ticketService.getNumberOfFlightBoughtTickets(id);
    }

    @PostMapping("/tickets")
    public void addTicket(@RequestBody Ticket ticket){
        ticketService.addTicket(ticket);
    }
    @DeleteMapping("/tickets")
    public void deleteTicket(@RequestBody Ticket ticket){
        ticketService.deleteTicket(ticket);
    }
    @DeleteMapping("/tickets/{id}")
    public void deleteTicketById(@PathVariable Long id){
        ticketService.deleteTicketById(id);
    }
    @GetMapping("/tickets/random")
    public void addTicket() {
        ticketService.addTicket(Ticket.builder()
                .User(userService.getSingleUser(1L))
                .Flight(flightService.getSingleFlight(1L))
                .build());

        ticketService.addTicket(Ticket.builder()
                .User(userService.getSingleUser(2L))
                .Flight(flightService.getSingleFlight(1L))
                .build());

        ticketService.addTicket(Ticket.builder()
                .User(userService.getSingleUser(3L))
                .Flight(flightService.getSingleFlight(1L))
                .build());

        ticketService.addTicket(Ticket.builder()
                .User(userService.getSingleUser(4L))
                .Flight(flightService.getSingleFlight(2L))
                .build());

        ticketService.addTicket(Ticket.builder()
                .User(userService.getSingleUser(4L))
                .Flight(flightService.getSingleFlight(1L))
                .build());
    }
}
