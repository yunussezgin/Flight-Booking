package com.yunus.flightbooking.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "airport")
public class Airport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "location")
	private String location;

	@OneToMany
	private Set<AirlineRoute> fromAirlineRoute;

	@OneToMany
	private Set<AirlineRoute> toAirlineRoute;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<AirlineRoute> getFromAirlineRoute() {
		return fromAirlineRoute;
	}

	public void setFromAirlineRoute(Set<AirlineRoute> fromAirlineRoute) {
		this.fromAirlineRoute = fromAirlineRoute;
	}

	public Set<AirlineRoute> getToAirlineRoute() {
		return toAirlineRoute;
	}

	public void setToAirlineRoute(Set<AirlineRoute> toAirlineRoute) {
		this.toAirlineRoute = toAirlineRoute;
	}

	@Override
	public String toString() {
		return "Airport [id=" + id + ", location=" + location + ", fromAirlineRoute=" + fromAirlineRoute
				+ ", toAirlineRoute=" + toAirlineRoute + "]";
	}

}
