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
    
    @Column(name="active")
    private int active;
    
    @ManyToOne
	@JoinColumn(name = "flight_id")
    private Flight flight;

}
