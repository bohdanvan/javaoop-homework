package com.bvan.oop.hw.lesson2.rectangle;

/**
 * @author bvanchuhov
 */
public class Rectangle {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        if (width <= 0) {
            throw new IllegalArgumentException("not positive width: " + width);
        }
        if (height <= 0) {
            throw new IllegalArgumentException("not positive height: " + height);
        }
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
