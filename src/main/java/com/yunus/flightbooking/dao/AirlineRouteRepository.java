package com.yunus.flightbooking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yunus.flightbooking.entity.AirlineCompany;
import com.yunus.flightbooking.entity.AirlineRoute;
import com.yunus.flightbooking.entity.Airport;

@Repository
public interface AirlineRouteRepository extends JpaRepository<AirlineRoute, Long> {

	List<AirlineRoute> findByAirlineCompany(AirlineCompany airlineCompany);

	List<AirlineRoute> findByFromAirport(Airport airport);

	List<AirlineRoute> findByToAirport(Airport airport);
}
