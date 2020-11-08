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
	private Airport fromAirport;

	@ManyToOne
	@JoinColumn(name = "to_airport_id")
	private Airport toAirport;

	@OneToMany
	private Set<Flight> flight;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AirlineCompany getAirlineCompany() {
		return airlineCompany;
	}

	public void setAirlineCompany(AirlineCompany airlineCompany) {
		this.airlineCompany = airlineCompany;
	}

	public Airport getFromAirport() {
		return fromAirport;
	}

	public void setFromAirport(Airport fromAirport) {
		this.fromAirport = fromAirport;
	}

	public Airport getToAirport() {
		return toAirport;
	}

	public void setToAirport(Airport toAirport) {
		this.toAirport = toAirport;
	}

	public Set<Flight> getFlight() {
		return flight;
	}

	public void setFlight(Set<Flight> flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "AirlineRoute [id=" + id + ", airlineCompany=" + airlineCompany + ", fromAirport=" + fromAirport
				+ ", toAirport=" + toAirport + ", flight=" + flight + "]";
	}

}
