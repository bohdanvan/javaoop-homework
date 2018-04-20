package com.bvan.oop.hw.lesson2.rectangle;

/**
 * @author bvanchuhov
 */
public class RectangleRunner {

    public static void main(String[] args) {
        Rectangles rectangles = new Rectangles();
        rectangles.add(new Rectangle(10.0, 20.0));
        rectangles.add(new Rectangle(3.0, 2.0));

        System.out.println(rectangles.getTotalArea()); // 206.0
    }
}
