package com.yunus.flightbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yunus.flightbooking.dao.TicketRepository;
import com.yunus.flightbooking.entity.Ticket;

@RestController
public class TicketController {

	@Autowired
	private TicketRepository ticketRepository;

	@GetMapping("/tickets")
	public List<Ticket> retrieveAllTickets() {
		return ticketRepository.findAll();
	}
}
