package bg.smg.airplanetickets.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "passengers_id")
    private List<Passenger> passengers;

    @Column(name = "date")
    private LocalDateTime date;
}
