package com.yunus.flightbooking.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    @JoinColumn(name="airline_route_id")
    private AirlineRoute airlineRoute;
    
    @Column(name = "ticket_count")
    private int ticketCount;
    
    @Column(name = "ticket_price")
    private Double ticketPrice;

    @Column(name = "leave_date")
    private Date leaveDate;

    @OneToMany(mappedBy = "flight")
    private List<Ticket> ticket = new ArrayList<>();
}
