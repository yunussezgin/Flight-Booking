package com.yunus.flightbooking.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yunus.flightbooking.dao.AirlineCompanyRepository;
import com.yunus.flightbooking.dao.AirlineRouteRepository;
import com.yunus.flightbooking.dao.FlightRepository;
import com.yunus.flightbooking.entity.AirlineCompany;
import com.yunus.flightbooking.entity.AirlineRoute;
import com.yunus.flightbooking.entity.Flight;

@RestController
public class FlightController {

	@Autowired
	private FlightRepository flightRepository;

	@Autowired
	private AirlineRouteRepository airlineRouteRepository;

	@Autowired
	private AirlineCompanyRepository airlineCompanyRepository;

	@GetMapping("/flights")
	public List<Flight> retrieveAllFlights() {
		return flightRepository.findAll();
	}

	@GetMapping("/flights/{id}")
	public Optional<Flight> retrieveFlight(@PathVariable Long id) {
		return flightRepository.findById(id);
	}

	@GetMapping("/flights/findbyairlinecompany/{name}")
	public List<Flight> retrieveFlightsByAirlineCompany(@PathVariable String name) {
		List<AirlineCompany> airlineCompanyList = airlineCompanyRepository.findByNameContainingIgnoreCase(name);

		List<AirlineRoute> airlineRoutes = new ArrayList<AirlineRoute>();

		for (AirlineCompany airlineCompany : airlineCompanyList) {
			List<AirlineRoute> airlineRouteList = airlineRouteRepository.findByAirlineCompany(airlineCompany);
			for (AirlineRoute airlineRoute : airlineRouteList)
				airlineRoutes.add(airlineRoute);
		}

		List<Flight> flights = new ArrayList<Flight>();

		for (AirlineRoute airlineRoute : airlineRoutes) {
			List<Flight> flightList = flightRepository.findByAirlineRoute(airlineRoute);
			for (Flight flight : flightList)
				flights.add(flight);
		}

		return flights;
	}

	@PostMapping("/flights")
	public void createFlight(@RequestBody Flight flight) {
		flightRepository.save(flight);
	}
}
