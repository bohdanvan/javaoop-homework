package com.bvan.oop.hw.lesson1.birthdate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author bvanchuhov
 */
public class DaysFromBirthDateCalculator {

    public static long daysFromBirthDate(String birthDateString) {
        LocalDate birthDate = LocalDate.parse(birthDateString);
        LocalDate now = LocalDate.now();
        return birthDate.until(now, ChronoUnit.DAYS);
    }
}
