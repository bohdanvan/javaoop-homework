package com.bvan.oop.hw.lesson5.airlineticket;

/**
 * @author bvanchuhov
 */
public class VipTicket extends Ticket {

    private final Baggage baggage;
    private final Meal meal;

    public VipTicket(PassengerInfo passengerInfo, FlightInfo flightInfo, Baggage baggage, Meal meal) {
        super(passengerInfo, flightInfo);
        this.baggage = baggage;
        this.meal = meal;
    }

    @Override
    public long getPrice() {
        return super.getPrice() + meal.getPrice() + baggage.getPrice();
    }

    public Baggage getBaggage() {
        return baggage;
    }

    public Meal getMeal() {
        return meal;
    }

    @Override
    public String toString() {
        return "VipTicket{" +
                "id='" + getId() + '\'' +
                ", passengerInfo=" + getPassengerInfo() +
                ", flightInfo=" + getFlightInfo() +
                ", baggage=" + baggage +
                ", meal=" + meal +
                '}';
    }
}
