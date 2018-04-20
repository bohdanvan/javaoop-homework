package com.bvan.oop.hw.lesson3.cinema;

import java.time.LocalDateTime;

/**
 * @author bvanchuhov
 */
public class CinemaRunner {

    public static void main(String[] args) {
        Movie movie = new Movie("Batman", 2008, 143, "Lonely man in triko saves the world");
        System.out.println(movie);

        HallForSession hall = new HallForSession(10, 10);

        hall.book(1, 1);
        hall.book(10, 10);
        hall.book(5, 5);
        hall.book(7, 7);
        hall.book(7, 8);
        hall.book(7, 9);

        System.out.println(hall.countBookedSeats()); // 6
        System.out.println(hall.countFreeSeats()); // 94

        MovieSession session = new MovieSession(movie, hall, 100, LocalDateTime.of(2008, 10, 10, 19, 0));

        System.out.println(session);
        System.out.println(session.getBoxOffice()); // 600
    }
}
