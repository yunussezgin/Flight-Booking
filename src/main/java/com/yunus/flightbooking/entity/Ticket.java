package com.yunus.flightbooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name="number")
    private String number;
    
    @Column(name="passenger_name")
    private String passangerName;
    
    @Column(name="passanger_surname")
    private String passangerSurname;
    
    @Column(name="card_number")
    private String cardNumber;
    
    @ManyToOne
	@JoinColumn(name = "flight_id")
    private Flight flight;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPassangerName() {
		return passangerName;
	}

	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}

	public String getPassangerSurname() {
		return passangerSurname;
	}

	public void setPassangerSurname(String passangerSurname) {
		this.passangerSurname = passangerSurname;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", number=" + number + ", passangerName=" + passangerName + ", passangerSurname="
				+ passangerSurname + ", cardNumber=" + cardNumber + ", flight=" + flight + "]";
	}

}
