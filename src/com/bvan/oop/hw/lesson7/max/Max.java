package com.bvan.oop.hw.lesson7.max;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author bvanchuhov
 */
public class Max {

    private Max() { }

    public static <T> T max(List<T> list, Comparator<T> comparator) {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }

        T max = list.get(0);
        for (T elem : list) {
            if (comparator.compare(max, elem) < 0) {
                max = elem;
            }
        }
        return max;
    }
}
