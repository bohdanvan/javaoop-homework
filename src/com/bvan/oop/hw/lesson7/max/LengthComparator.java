package com.bvan.oop.hw.lesson7.max;

import java.util.Comparator;

/**
 * Сравнивает 2 строки по длине.
 * @author bvanchuhov
 */
public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
        // OR: return Integer.compare(s1.length(), s2.length());
    }
}
