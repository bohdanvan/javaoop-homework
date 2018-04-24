package com.bvan.oop.hw.lesson5.airlineticket;

/**
 * @author bvanchuhov
 */
public class Baggage {

    private final long pricePerBag;
    private final int bags;

    public Baggage(long pricePerBag, int bags) {
        this.pricePerBag = pricePerBag;
        this.bags = bags;
    }

    public long getPricePerBag() {
        return pricePerBag;
    }

    public int getBags() {
        return bags;
    }

    public long getPrice() {
        return pricePerBag * bags;
    }

    @Override
    public String toString() {
        return "Baggage{" +
                "pricePerBag=" + pricePerBag +
                ", bags=" + bags +
                '}';
    }
}
