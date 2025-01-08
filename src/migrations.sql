
CREATE DATABASE airlinetickets;
USE airlinetickets;

CREATE TABLE passengers (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(255),
    email VARCHAR(255),
    phone_number VARCHAR(255),
    passport_number VARCHAR(255)
);

CREATE TABLE reservations (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    reservation_date DATETIME
);

CREATE TABLE passengers_in_reservations (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    reservation BIGINT,
    passenger BIGINT,
    FOREIGN KEY (reservation) REFERENCES reservations(id),
    FOREIGN KEY (passenger) REFERENCES passengers(id)
);

CREATE TABLE airports (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    airport_name VARCHAR(255),
    airport_location VARCHAR(255),
    code VARCHAR(255)
);

CREATE TABLE airlines (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    airline_name VARCHAR(255),
    airline_code VARCHAR(255)
);

CREATE TABLE flights (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    flight_number VARCHAR(255),
    departure_time DATETIME,
    arrival_time DATETIME,
    origin_airport BIGINT,
    destination_airport BIGINT,
    airline BIGINT,
    FOREIGN KEY (origin_airport) REFERENCES airports(id),
    FOREIGN KEY (destination_airport) REFERENCES airports(id),
    FOREIGN KEY (airline) REFERENCES airlines(id)
);

CREATE TABLE tickets (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    seat_number VARCHAR(255),
    price DECIMAL(10, 2),
    travelling_class VARCHAR(255),
    reservation BIGINT,
    flight BIGINT,
    FOREIGN KEY (reservation) REFERENCES reservations(id),
    FOREIGN KEY (flight) REFERENCES flights(id)
);

CREATE TABLE payment_methods (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    method VARCHAR(255)
);

INSERT INTO payment_methods (method) VALUE ("Cash");
INSERT INTO payment_methods (method) VALUE ("Debit Card");
INSERT INTO payment_methods (method) VALUE ("Bank Transfer");

CREATE TABLE transactions (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    amount DECIMAL(10, 2),
    transaction_time DATETIME,
    payment_method BIGINT,
    reservation BIGINT,
    FOREIGN KEY (reservation) REFERENCES reservations(id),
    FOREIGN KEY (payment_method) REFERENCES payment_methods(id)
);

