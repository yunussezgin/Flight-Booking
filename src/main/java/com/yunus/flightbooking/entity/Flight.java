package com.yunus.flightbooking.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
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
@Table(name = "flight")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "airline_route_id")
	private AirlineRoute airlineRoute;

	@Column(name = "ticket_count")
	private int ticketCount;

	@Column(name = "ticket_price")
	private Double ticketPrice;

	@Column(name = "leave_date")
	private Date leaveDate;

	@OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
	private Set<Ticket> ticket;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AirlineRoute getAirlineRoute() {
		return airlineRoute;
	}

	public void setAirlineRoute(AirlineRoute airlineRoute) {
		this.airlineRoute = airlineRoute;
	}

	public int getTicketCount() {
		return ticketCount;
	}

	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}

	public Double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Date getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}

	public Set<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(Set<Ticket> ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", airlineRoute=" + airlineRoute + ", ticketCount=" + ticketCount + ", ticketPrice="
				+ ticketPrice + ", leaveDate=" + leaveDate + ", ticket=" + ticket + "]";
	}
	
}
