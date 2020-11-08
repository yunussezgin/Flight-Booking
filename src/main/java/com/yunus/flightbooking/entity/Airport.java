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
    
    @OneToMany(mappedBy = "from_airport")
    private Set<AirlineRoute> fromAirlineRoute;
    
    @OneToMany(mappedBy = "to_airport")
    private Set<AirlineRoute> toAirlineRoute;
}
