package com.yunus.flightbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
