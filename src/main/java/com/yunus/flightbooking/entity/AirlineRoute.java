package com.yunus.flightbooking.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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

	public Airport getFrom_airport() {
		return from_airport;
	}

	public void setFrom_airport(Airport from_airport) {
		this.from_airport = from_airport;
	}

	public Airport getTo_airport() {
		return to_airport;
	}

	public void setTo_airport(Airport to_airport) {
		this.to_airport = to_airport;
	}

	public Set<Flight> getFlight() {
		return flight;
	}

	public void setFlight(Set<Flight> flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "AirlineRoute [id=" + id + ", airlineCompany=" + airlineCompany + ", from_airport=" + from_airport
				+ ", to_airport=" + to_airport + ", flight=" + flight + "]";
	}

}
