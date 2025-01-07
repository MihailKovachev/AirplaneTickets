package bg.smg.airplanetickets.model;

public class Ticket {

    private int id;

    private int seatNumber;

    private float price;

    private TravellingClass travellingClass;

    private Reservation reservation;

    private Flight flight;

}

enum TravellingClass {
    First,
    Economy,
    Business
}