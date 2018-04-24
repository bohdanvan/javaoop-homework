package com.bvan.oop.hw.lesson5.airlineticket;

import java.util.UUID;

/**
 * @author bvanchuhov
 */
public class Ticket {

    private final String id = UUID.randomUUID().toString();
    private final PassengerInfo passengerInfo;
    private final FlightInfo flightInfo;

    public Ticket(PassengerInfo passengerInfo, FlightInfo flightInfo) {
        this.passengerInfo = passengerInfo;
        this.flightInfo = flightInfo;
    }

    public String getId() {
        return id;
    }

    public PassengerInfo getPassengerInfo() {
        return passengerInfo;
    }

    public FlightInfo getFlightInfo() {
        return flightInfo;
    }

    public long getPrice() {
        return flightInfo.getPrice();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", passengerInfo=" + passengerInfo +
                ", flightInfo=" + flightInfo +
                '}';
    }
}

