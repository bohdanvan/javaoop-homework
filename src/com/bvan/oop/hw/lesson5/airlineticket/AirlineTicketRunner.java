package com.bvan.oop.hw.lesson5.airlineticket;

import java.time.LocalDateTime;

/**
 * @author bvanchuhov
 */
public class AirlineTicketRunner {

    public static void main(String[] args) {
        PassengerInfo taras = new PassengerInfo("Taras", "Tarasiv", "AB12345");
        FlightInfo london = new FlightInfo(
                "12345",
                new Airport("Ukraine", "Kyiv", "Zhulyany"),
                new Airport("United Kingdom", "London", "Luton"),
                LocalDateTime.of(2018, 8, 4, 7, 30),
                "12D",
                5000
        );
        Ticket ticket = new Ticket(taras, london);
        VipTicket vipTicket = new VipTicket(taras, london, new Baggage(300, 2), new Meal("dinner", true, 200));

        System.out.println(ticket.getPrice());
        System.out.println(vipTicket.getPrice());
    }
}
