package com.bvan.oop.hw.lesson4.taxi;

/**
 * @author bvanchuhov
 */
public class TaxiRunner {

    public static void main(String[] args) {
        Tariff standardTariff = new StandardTariff();
        Tariff familyTariff = new FamilyTariff();

        Ride ride1 = new Ride(2, 12, 30, standardTariff);
        Ride ride2 = new Ride(2, 12, 30, familyTariff);

        System.out.println(ride1.getPrice()); // 150
        System.out.println(ride2.getPrice()); // 6000

        RidesHistory historyList = new RidesHistory();
        historyList.addRide(ride1);
        historyList.addRide(ride2);
        System.out.println(historyList.getTotalPrice()); // 6150
    }
}
