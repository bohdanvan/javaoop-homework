package com.bvan.oop.hw.lesson7.max;

import java.time.LocalDate;
import java.util.Comparator;

/**
 * Сравнивает 2 даты по номеру дня в году.
 * @author bvanchuhov
 */
public class DayInYearComparator implements Comparator<LocalDate> {
    @Override
    public int compare(LocalDate ld1, LocalDate ld2) {
        return ld1.getDayOfYear() - ld2.getDayOfYear();
        // OR: return Integer.compare(ld1.getDayOfYear(), ld2.getDayOfYear());
    }
}
