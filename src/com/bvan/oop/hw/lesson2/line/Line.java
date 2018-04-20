package com.bvan.oop.hw.lesson2.line;

/**
 * @author bvanchuhov
 */
public class Line {

    private final Point start;
    private final Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double getLength() {
        double xDiff = start.getX() - end.getX();
        double yDiff = start.getY() - end.getY();
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }


    @Override
    public String toString() {
        return start + " -> " + end;
    }
}
