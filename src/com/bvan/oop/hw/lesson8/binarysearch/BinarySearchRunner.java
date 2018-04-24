package com.bvan.oop.hw.lesson8.binarysearch;

/**
 * @author bvanchuhov
 */
public class BinarySearchRunner {

    public static void main(String[] args) {
        int[] array = {10, 20, 20, 30, 50};
        System.out.println(BinarySearch.binarySearch(array, 30)); // 3
        System.out.println(BinarySearch.binarySearch(array, 20)); // 2
        System.out.println(BinarySearch.binarySearch(array, 40)); // -5
    }
}
