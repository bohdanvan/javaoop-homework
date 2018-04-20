package com.bvan.oop.hw.lesson4.taxi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class RidesHistory {

    private final List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public long getTotalPrice() {
        long totalPrice = 0;
        for (Ride ride : rides) {
            totalPrice += ride.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "RidesHistory{" +
                "rides=" + rides +
                '}';
    }
}
