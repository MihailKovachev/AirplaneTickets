package bg.smg.airplanetickets.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "seat_number")
    private int seatNumber;

    @Column(name = "price")
    private float price;

    @Column(name = "travelling_class")
    private TravellingClass travellingClass;

    @Column(name = "reservation_id")
    private Reservation reservation;

    @Column(name = "flight_id")
    private Flight flight;

}

@Table(name = "travelling_classes")
enum TravellingClass {
    First,
    Economy,
    Business
}