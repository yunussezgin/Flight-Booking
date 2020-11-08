package com.yunus.flightbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yunus.flightbooking.dao.AirlineCompanyRepository;
import com.yunus.flightbooking.entity.AirlineCompany;

@RestController
public class AirlineCompanyController {
	
	@Autowired
	private AirlineCompanyRepository airlineCompanyRepository;
	
	@GetMapping("/airlinecompanies")
	public List<AirlineCompany> retrieveAirlineCompanies() {
		return airlineCompanyRepository.findAll();
	}
}
