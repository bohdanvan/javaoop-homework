package com.bvan.oop.hw.lesson7.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author bvanchuhov
 */
public class Filter {

    private Filter() {
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> res = new ArrayList<>();
        for (T elem : list) {
            if (predicate.test(elem)) {
                res.add(elem);
            }
        }
        return res;
    }
}
