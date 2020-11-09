package com.yunus.flightbooking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yunus.flightbooking.dao.TicketRepository;
import com.yunus.flightbooking.entity.Ticket;
import com.yunus.flightbooking.util.Utility;

@RestController
public class TicketController {

	@Autowired
	private TicketRepository ticketRepository;

	@GetMapping("/tickets")
	public List<Ticket> retrieveAllTickets() {
		return ticketRepository.findAll();
	}

	@GetMapping("/tickets/{id}")
	public Optional<Ticket> retrieveTicket(@PathVariable Long id) {
		return ticketRepository.findById(id);
	}

	@GetMapping("/tickets/findbynumber/{number}")
	public Ticket retrieveTicketByName(@PathVariable String number) {
		return ticketRepository.findByNumber(number);
	}

	@PostMapping("/tickets")
	public void createTicket(@RequestBody Ticket ticket) {
		ticket.setCardNumber(Utility.maskText(ticket.getCardNumber().replaceAll("\\D+", ""), 6, 12, '*'));
		ticketRepository.save(ticket);
	}

	@DeleteMapping("/tickets/{id}")
	public void deleteTicket(@PathVariable Long id) {
		ticketRepository.deleteById(id);
	}

	@DeleteMapping("/tickets/deletebynumber/{number}")
	public void deleteTicketByNumber(@PathVariable String number) {
		Ticket ticket = ticketRepository.findByNumber(number);
		ticketRepository.deleteById(ticket.getId());
	}
}
