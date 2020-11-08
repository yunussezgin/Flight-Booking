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
import com.yunus.flightbooking.dao.AirportRepository;
import com.yunus.flightbooking.entity.AirlineCompany;
import com.yunus.flightbooking.entity.AirlineRoute;
import com.yunus.flightbooking.entity.Airport;

@RestController
public class AirlineRouteController {

	@Autowired
	private AirlineRouteRepository airlineRouteRepository;

	@Autowired
	private AirportRepository airportRepository;

	@Autowired
	private AirlineCompanyRepository airlineCompanyRepository;

	@GetMapping("/airlineroutes")
	public List<AirlineRoute> retrieveAllAirlineRoutes() {
		return airlineRouteRepository.findAll();
	}

	@GetMapping("/airlineroutes/{id}")
	public Optional<AirlineRoute> retrieveAirlineroute(@PathVariable Long id) {
		return airlineRouteRepository.findById(id);
	}

	@GetMapping("/airlineroutes/findbyairlinecompany/{name}")
	public List<AirlineRoute> retrieveAirlineRoutesByAirlineCompany(@PathVariable String name) {
		List<AirlineCompany> airlineCompanyList = airlineCompanyRepository.findByNameContainingIgnoreCase(name);
		List<AirlineRoute> airlineRoutes = new ArrayList<AirlineRoute>();
		for (AirlineCompany airlineCompany : airlineCompanyList) {
			List<AirlineRoute> airlineRouteList = airlineRouteRepository.findByAirlineCompany(airlineCompany);
			for (AirlineRoute airlineRoute : airlineRouteList)
				airlineRoutes.add(airlineRoute);
		}
		return airlineRoutes;
	}

	@GetMapping("/airlineroutes/findbyfromairport/{location}")
	public List<AirlineRoute> retrieveAirlineRoutesByFromAirport(@PathVariable String location) {
		List<Airport> airportList = airportRepository.findByLocationContainingIgnoreCase(location);
		List<AirlineRoute> airlineRoutes = new ArrayList<AirlineRoute>();
		for (Airport airport : airportList) {
			List<AirlineRoute> airlineRouteList = airlineRouteRepository.findByFromAirport(airport);
			for (AirlineRoute airlineRoute : airlineRouteList)
				airlineRoutes.add(airlineRoute);
		}
		return airlineRoutes;
	}

	@GetMapping("/airlineroutes/findbytoairport/{location}")
	public List<AirlineRoute> retrieveAirlineRoutesByToAirport(@PathVariable String location) {
		List<Airport> airportList = airportRepository.findByLocationContainingIgnoreCase(location);
		List<AirlineRoute> airlineRoutes = new ArrayList<AirlineRoute>();
		for (Airport airport : airportList) {
			List<AirlineRoute> airlineRouteList = airlineRouteRepository.findByToAirport(airport);
			for (AirlineRoute airlineRoute : airlineRouteList)
				airlineRoutes.add(airlineRoute);
		}
		return airlineRoutes;
	}

	@PostMapping("/airlineroutes")
	public void createAirlineRoute(@RequestBody AirlineRoute airlineRoute) {
		airlineRouteRepository.save(airlineRoute);
	}
}
