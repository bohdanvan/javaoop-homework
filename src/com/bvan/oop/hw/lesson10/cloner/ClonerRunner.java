package com.bvan.oop.hw.lesson10.cloner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ClonerRunner {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Taras", "Maria", "Ivan"));
        List<String> clone = new Cloner().clone(names);
        System.out.println(clone.equals(names)); // true
    }
}
