package com.bvan.oop.hw.lesson1.longestname;

import java.util.ArrayList;
import java.util.Arrays;

import static com.bvan.oop.hw.lesson1.longestname.LongestNameFinder.longestName;

/**
 * @author bvanchuhov
 */
public class LongestNameRunner {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Phil", "Anny", "Richard", "Chris"));
        System.out.println(longestName(names)); // Richard

//        LongestNameFinder.longestName(new ArrayList<>()); // IllegalArgumentException
    }
}
