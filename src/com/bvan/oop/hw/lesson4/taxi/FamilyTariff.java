package com.bvan.oop.hw.lesson4.taxi;

/**
 * @author bvanchuhov
 */
public class FamilyTariff implements Tariff {

    @Override
    public long calculatePrice(Ride ride) {
        return 50 * 20 * ride.getDistance() / ride.getPassengers();
    }
}
