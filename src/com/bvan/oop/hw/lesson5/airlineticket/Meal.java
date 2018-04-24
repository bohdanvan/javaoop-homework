package com.bvan.oop.hw.lesson5.airlineticket;

/**
 * @author bvanchuhov
 */
public class Meal {

    private final String type;
    private final boolean withDrink;
    private final long price;

    public Meal(String type, boolean withDrink, long price) {
        this.type = type;
        this.withDrink = withDrink;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public boolean isWithDrink() {
        return withDrink;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "type='" + type + '\'' +
                ", withDrink=" + withDrink +
                ", price=" + price +
                '}';
    }
}
