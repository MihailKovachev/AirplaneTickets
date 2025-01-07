package bg.smg.airplanetickets.model;

import java.time.LocalDateTime;

public class Flight {

    private int id;
    private String number;

    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    private Airport originAirport;
    private Airport destinationAirport;

    private Airline airline;

}
