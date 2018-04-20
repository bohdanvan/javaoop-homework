package com.bvan.oop.hw.lesson2.line;

/**
 * @author bvanchuhov
 */
public class LineRunner {

    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(-6, 8);

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point1, point3);

        System.out.println("Length of Line1: " + line1.getLength()); // 5.0
        System.out.println("Length of Line2: " + line2.getLength()); // 10.0
        System.out.println();

        Lines lines = new Lines();
        lines.add(line1);
        lines.add(line2);

        System.out.println("Total lines' length: " + lines.getTotalLength()); // 15.0
        System.out.println("Longest line: " + lines.getLongestLine()); // (0.0, 0.0) -> (-6.0, 8.0)
    }
}
