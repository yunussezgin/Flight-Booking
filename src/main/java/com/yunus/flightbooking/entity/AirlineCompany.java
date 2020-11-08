package com.yunus.flightbooking.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "airline_company")
public class AirlineCompany {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@OneToMany
	private Set<AirlineRoute> airlineRoutes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<AirlineRoute> getAirlineRoutes() {
		return airlineRoutes;
	}

	public void setAirlineRoutes(Set<AirlineRoute> airlineRoutes) {
		this.airlineRoutes = airlineRoutes;
	}

	@Override
	public String toString() {
		return "AirlineCompany [id=" + id + ", name=" + name + ", airlineRoutes=" + airlineRoutes + "]";
	}

}
