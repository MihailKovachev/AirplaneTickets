package bg.smg.airplanetickets.model;

import java.time.LocalDateTime;

public class Transaction {

    private int id;

    private float amount;

    private PaymentMethod paymentMethod;

    private Reservation reservation;

    private LocalDateTime date;

}

enum PaymentMethod {
    DebitCard,
    BankTransfer,
    Cash
}