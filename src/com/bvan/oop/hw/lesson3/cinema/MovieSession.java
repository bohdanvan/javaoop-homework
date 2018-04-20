package com.bvan.oop.hw.lesson3.cinema;

import java.time.LocalDateTime;

/**
 * @author bvanchuhov
 */
public class MovieSession {

    private final Movie movie;
    private final HallForSession hall;
    private final long price;
    private final LocalDateTime startDate;

    public MovieSession(Movie movie, HallForSession hall, long price, LocalDateTime startDate) {
        this.movie = movie;
        this.hall = hall;
        this.price = price;
        this.startDate = startDate;
    }

    public long getBoxOffice() {
        return hall.countBookedSeats() * price;
    }

    @Override
    public String toString() {
        return "MovieSession{" +
                "movie=" + movie +
                ", hall=" + hall +
                ", price=" + price +
                ", startDate=" + startDate +
                '}';
    }
}
