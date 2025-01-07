package bg.smg.airplanetickets.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "amount")
    private float amount;

    @Column(name = "payment_method")
    private PaymentMethod paymentMethod;

    @Column(name = "reservation_id")
    private Reservation reservation;

    @Column(name = "date")
    private LocalDateTime date;

}

@Table(name = "payment_methods")
enum PaymentMethod {
    DebitCard,
    BankTransfer,
    Cash
}