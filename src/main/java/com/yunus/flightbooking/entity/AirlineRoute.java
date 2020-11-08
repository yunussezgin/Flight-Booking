package com.yunus.flightbooking.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "airline_route")
public class AirlineRoute {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "airline_company_id")
	private AirlineCompany airlineCompany;

	@ManyToOne
	@JoinColumn(name = "from_airport_id")
	private Airport from_airport;

	@ManyToOne
	@JoinColumn(name = "to_airport_id")
	private Airport to_airport;

	@OneToMany(mappedBy = "flight_id")
	private Set<Flight> flight;
}
