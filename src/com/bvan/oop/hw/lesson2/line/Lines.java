package com.bvan.oop.hw.lesson2.line;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class Lines {

    private final ArrayList<Line> lines = new ArrayList<>();

    public void add(Line line) {
        lines.add(line);
    }

    public double getTotalLength() {
        double totalLength = 0.0;
        for (Line line : lines) {
            totalLength += line.getLength();
        }
        return totalLength;
    }

    public Line getLongestLine() {
        if (lines.isEmpty()) {
            throw new IllegalStateException("empty list of lines");
        }

        Line longestLine = lines.get(0);
        double maxLength = longestLine.getLength();
        for (Line line : lines) {
            double length = line.getLength();
            if (maxLength < length) {
                longestLine = line;
                maxLength = length;
            }
        }
        return longestLine;
    }

    @Override
    public String toString() {
        return "Lines{" +
                "lines=" + lines +
                '}';
    }
}
