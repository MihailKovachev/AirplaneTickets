package bg.smg.airplanetickets.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "number")
    private String number;

    @Column(name = "departure_time")
    private LocalDateTime departureTime;

    @Column(name = "arrival_time")
    private LocalDateTime arrivalTime;

    @Column(name = "origin_airport")
    private Airport originAirport;

    @Column(name = "destination_airport")
    private Airport destinationAirport;

    @Column(name = "airline_id")
    private Airline airline;

}
