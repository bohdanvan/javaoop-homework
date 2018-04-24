package com.bvan.oop.hw.lesson5.airlineticket;

import java.time.LocalDateTime;

/**
 * @author bvanchuhov
 */
public class FlightInfo {

    private final String id;
    private final Airport departure;
    private final Airport destination;
    private final LocalDateTime departureTime;
    private final String seat;
    private final long price;

    public FlightInfo(String id, Airport departure, Airport destination, LocalDateTime departureTime, String seat, long price) {
        this.id = id;
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
        this.seat = seat;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public Airport getDeparture() {
        return departure;
    }

    public Airport getDestination() {
        return destination;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public String getSeat() {
        return seat;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "FlightInfo{" +
                "id='" + id + '\'' +
                ", departure=" + departure +
                ", destination=" + destination +
                ", departureTime=" + departureTime +
                ", seat='" + seat + '\'' +
                ", price=" + price +
                '}';
    }
}
