package com.yunus.flightbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yunus.flightbooking.entity.AirlineRoute;

@Repository
public interface AirlineRouteRepository extends JpaRepository<AirlineRoute, Long> {

}
