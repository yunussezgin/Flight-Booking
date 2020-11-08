package com.yunus.flightbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yunus.flightbooking.entity.AirlineCompany;

@Repository
public interface AirlineCompanyRepository extends JpaRepository<AirlineCompany, Long> {

}
