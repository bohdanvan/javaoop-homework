package com.bvan.oop.hw.lesson4.taxi;

/**
 * @author bvanchuhov
 */
public class StandardTariff implements Tariff {

    @Override
    public long calculatePrice(Ride ride) {
        return 30 + 5 * ride.getDistance() + 2 * ride.getDuration();
    }
}
