package com.bvan.oop.hw.lesson8.binarysearch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class BinarySearch {

    public static int binarySearch(int[] array, int elem) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            int middleElem = array[middle];

            if (middleElem < elem) {
                low = middle + 1;
            } else if (middleElem > elem) {
                high = middle - 1;
            } else {
                return middle; // key found
            }
        }
        return -(low + 1); // key not found.
    }

    public static <T> int binarySearch(List<T> list, T elem, Comparator<T> comparator) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            T middleElem = list.get(middle);

            int cmp = comparator.compare(middleElem, elem);
            if (cmp < 0) {
                low = middle + 1;
            } else if (cmp > 0) {
                high = middle - 1;
            } else {
                return middle; // key found
            }
        }
        return -(low + 1); // key not found.
    }
}
