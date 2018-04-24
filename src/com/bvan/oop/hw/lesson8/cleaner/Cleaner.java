package com.bvan.oop.hw.lesson8.cleaner;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * @author bvanchuhov
 */
public class Cleaner {

    public static void removeNulls(Collection<?> collection) {
        Iterator<?> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == null) {
                iterator.remove();
            }
        }
    }

    public static <T> void remove(Collection<T> collection, Predicate<T> predicate) {
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (predicate.test(iterator.next())) {
                iterator.remove();
            }
        }
    }
}
