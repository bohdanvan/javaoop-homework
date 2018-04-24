package com.bvan.oop.hw.lesson7.comparablepair;

/**
 * @author bvanchuhov
 */
public class ComparablePair<T extends Comparable<? super T>> {

    private final T left;
    private final T right;

    public ComparablePair(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T bigger() {
        return left.compareTo(right) >= 0 ? left : right;
    }

    public T smaller() {
        return left.compareTo(right) <= 0 ? left : right;
    }
}
