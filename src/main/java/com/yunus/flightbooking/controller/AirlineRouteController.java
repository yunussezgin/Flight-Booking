package com.yunus.flightbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yunus.flightbooking.dao.AirlineRouteRepository;
import com.yunus.flightbooking.entity.AirlineRoute;

@RestController
public class AirlineRouteController {

	@Autowired
	private AirlineRouteRepository airlineRouteRepository;

	@GetMapping("/airlineroutes")
	public List<AirlineRoute> retrieveAllAirlineRoutes() {
		return airlineRouteRepository.findAll();
	}
}
