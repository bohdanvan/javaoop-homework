package com.bvan.oop.hw.lesson7.filter;

import java.time.LocalDate;
import java.util.function.Predicate;

/**
 * Проверяет, находится ли дата после фиксированной даты.
 * @author bvanchuhov
 */
public class DateAfterPredicate implements Predicate<LocalDate> {

    private final LocalDate minDate;

    public DateAfterPredicate(LocalDate minDate) {
        this.minDate = minDate;
    }

    @Override
    public boolean test(LocalDate date) {
        return date.compareTo(minDate) > 0;
    }
}
