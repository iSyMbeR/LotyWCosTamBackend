package com.lotywkosmos.lotywkosmos.service;

import com.lotywkosmos.lotywkosmos.Exception.TicketNotFoundException;
import com.lotywkosmos.lotywkosmos.model.Flight;
import com.lotywkosmos.lotywkosmos.model.Ticket;
import com.lotywkosmos.lotywkosmos.model.User;
import com.lotywkosmos.lotywkosmos.repository.FlightRepository;
import com.lotywkosmos.lotywkosmos.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketService {
    private final TicketRepository ticketRepository;//injection

    public List<Ticket> getTickets() {
        return ticketRepository.findAll();
    }

    public Ticket getSingleTicket(long id) {
        return ticketRepository.findById(id)
                .orElseThrow((() -> new TicketNotFoundException("Ticket with id " + id + " was not found")));
    }

    public void addTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    public List<Ticket> getTicketsByUserId(Long userId){
        return ticketRepository.getTicketsByUser(userId);
    }
    public List<Ticket> getTicketsByFlight(Long flightId){
        return ticketRepository.getTicketsByFlight(flightId);
    }

    public Long getNumberOfUserTickets(Long userId){
        return ticketRepository.getNumberOfUserTickets(userId);
    }

    public Long getNumberOfFlightBoughtTickets(Long flightId){
        return ticketRepository.getNumberOfFlightBoughtTickets(flightId);
    }

    public void deleteTicket(Ticket ticket){
        ticketRepository.delete(ticket);
    }
    public void deleteTicketById(Long idTicket){
        ticketRepository.deleteById(idTicket);
    }
}

