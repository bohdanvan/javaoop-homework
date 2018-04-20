package com.bvan.oop.hw.lesson2.rectangle;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class Rectangles {

    private final ArrayList<Rectangle> rectangles = new ArrayList<>();

    public void add(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public double getTotalArea() {
        double totalArea = 0.0;
        for (Rectangle rectangle : rectangles) {
            totalArea += rectangle.getArea();
        }
        return totalArea;
    }

    @Override
    public String toString() {
        return "Rectangles{" +
                "rectangles=" + rectangles +
                '}';
    }
}
