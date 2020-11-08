package com.yunus.flightbooking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yunus.flightbooking.dao.AirlineCompanyRepository;
import com.yunus.flightbooking.entity.AirlineCompany;

@RestController
public class AirlineCompanyController {

	@Autowired
	private AirlineCompanyRepository airlineCompanyRepository;

	@GetMapping("/airlinecompanies")
	public List<AirlineCompany> retrieveAllAirlineCompanies() {
		return airlineCompanyRepository.findAll();
	}

	@GetMapping("/airlinecompanies/{id}")
	public Optional<AirlineCompany> retrieveAirlineCompany(@PathVariable Long id) {
		return airlineCompanyRepository.findById(id);
	}
	
	@GetMapping("/airlinecompanies/findbyname/{name}")
	public List<AirlineCompany> retrieveAirlineCompanyByName(@PathVariable String name) {
		return airlineCompanyRepository.findByNameContainingIgnoreCase(name);
	}

	@PostMapping("/airlinecompanies")
	public void createAirlineCompany(@RequestBody AirlineCompany airlineCompany) {
		airlineCompanyRepository.save(airlineCompany);
	}
}
