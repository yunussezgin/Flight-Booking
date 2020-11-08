package com.yunus.flightbooking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yunus.flightbooking.dao.AirportRepository;
import com.yunus.flightbooking.entity.Airport;

@RestController
public class AirportController {

	@Autowired
	private AirportRepository airportRepository;

	@GetMapping("/airports")
	public List<Airport> retrieveAllAirports() {
		return airportRepository.findAll();
	}

	@GetMapping("/airports/{id}")
	public Optional<Airport> retrieveAirports(@PathVariable Long id) {
		return airportRepository.findById(id);
	}

	@GetMapping("/airports/findbyname/{location}")
	public List<Airport> retrieveAirportByLocation(@PathVariable String location) {
		return airportRepository.findByLocationContainingIgnoreCase(location);
	}

	@PostMapping("/airports")
	public void createAirport(@RequestBody Airport airport) {
		airportRepository.save(airport);
	}
}
