package bg.smg.airplanetickets.model;

import jakarta.persistence.*;

@Entity
@Table(name = "airlines")
public class Airline {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;
}
