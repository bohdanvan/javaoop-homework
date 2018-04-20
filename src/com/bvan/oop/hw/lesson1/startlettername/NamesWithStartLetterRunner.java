package com.bvan.oop.hw.lesson1.startlettername;

import java.util.ArrayList;
import java.util.Arrays;

import static com.bvan.oop.hw.lesson1.startlettername.NamesWithStartLetterFinder.namesWithStartLetter;

/**
 * @author bvanchuhov
 */
public class NamesWithStartLetterRunner {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Phil", "Anny", "Aaron", "Bob"));
        System.out.println(namesWithStartLetter(names, 'A')); // [Anny, Aaron]
        System.out.println(namesWithStartLetter(names, 'C')); // []

        System.out.println(namesWithStartLetter(new ArrayList<>(), 'A')); // []
    }
}
