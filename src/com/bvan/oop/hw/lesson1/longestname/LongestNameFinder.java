package com.bvan.oop.hw.lesson1.longestname;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class LongestNameFinder {

    public static String longestName(ArrayList<String> names) {
        if (names.isEmpty()) {
            throw new IllegalArgumentException("empty list of names");
        }

        String longestName = names.get(0);
        for (String name : names) {
            if (longestName.length() < name.length()) {
                longestName = name;
            }
        }
        return longestName;
    }
}
