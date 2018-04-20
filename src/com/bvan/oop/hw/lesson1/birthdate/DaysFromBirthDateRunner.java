package com.bvan.oop.hw.lesson1.birthdate;

import static com.bvan.oop.hw.lesson1.birthdate.DaysFromBirthDateCalculator.daysFromBirthDate;

/**
 * @author bvanchuhov
 */
public class DaysFromBirthDateRunner {

    public static void main(String[] args) {
        System.out.println(daysFromBirthDate("1972-12-28"));
        System.out.println(daysFromBirthDate("2005-05-01"));
    }
}
