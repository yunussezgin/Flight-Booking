package com.yunus.flightbooking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yunus.flightbooking.entity.AirlineRoute;
import com.yunus.flightbooking.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

	List<Flight> findByAirlineRoute(AirlineRoute airlineRoute);
}
