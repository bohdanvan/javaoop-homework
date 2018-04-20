package com.bvan.oop.hw.lesson1.startlettername;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class NamesWithStartLetterFinder {

    public static ArrayList<String> namesWithStartLetter(ArrayList<String> names, char startLetter) {
        ArrayList<String> result = new ArrayList<>();
        for (String name : names) {
            if (!name.isEmpty() && name.charAt(0) == startLetter) {
                result.add(name);
            }
        }
        return result;
    }
}
