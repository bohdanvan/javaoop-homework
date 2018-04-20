package com.bvan.oop.hw.lesson3.cinema;

/**
 * @author bvanchuhov
 */
public class HallForSession {

    private static final boolean FREE_SEAT = false;
    private static final boolean BOOKED_SEAT = true;

    private final boolean[][] seats;

    public HallForSession(int rows, int seatsInRow) {
        seats = new boolean[rows][seatsInRow];
    }

    /**
     * @param row  indexing from 1
     * @param seat indexing from 1
     */
    public void book(int row, int seat) {
        if (row < 1 || row > getRows()) {
            throw new IllegalArgumentException("illegal row: " + row);
        }
        if (seat < 1 || seat > getSeatsInRow()) {
            throw new IllegalArgumentException("illegal seat: " + seat);
        }
        if (seats[row - 1][seat - 1] == BOOKED_SEAT) {
            throw new IllegalArgumentException("the seat is already booked: row " + row + ", seat = " + seat);
        }
        seats[row - 1][seat - 1] = BOOKED_SEAT;
    }

    private int getRows() {
        return seats.length;
    }

    private int getSeatsInRow() {
        return seats[0].length;
    }

    public int countBookedSeats() {
        int bookedSeatsCounter = 0;
        for (boolean[] row : seats) {
            for (boolean seat : row) {
                if (seat == BOOKED_SEAT) {
                    bookedSeatsCounter++;
                }
            }
        }
        return bookedSeatsCounter;
    }

    public int countFreeSeats() {
        int freeSeatsCounter = 0;
        for (boolean[] row : seats) {
            for (boolean seat : row) {
                if (seat == FREE_SEAT) {
                    freeSeatsCounter++;
                }
            }
        }
        return freeSeatsCounter;
    }

    @Override
    public String toString() {
        return "HallForSession{" +
                "rows=" + getRows() +
                ", seatInRow=" + getSeatsInRow() +
                '}';
    }
}
