package com.bvan.oop.hw.lesson9.finder;

import java.util.List;

/**
 * @author bvanchuhov
 */
public interface MovieYearFinder {

    void add(Movie movie);

    List<Movie> findByReleaseYear(int releaseYear);

    List<Movie> findByReleaseYears(int minReleaseYear, int maxReleaseYear);
}
