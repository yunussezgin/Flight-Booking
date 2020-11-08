package com.yunus.flightbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yunus.flightbooking.dao.FlightRepository;
import com.yunus.flightbooking.entity.Flight;

@RestController
public class FlightController {

	@Autowired
	private FlightRepository flightRepository;

	@GetMapping("/flights")
	public List<Flight> retrieveAllFlights() {
		return flightRepository.findAll();
	}
}
