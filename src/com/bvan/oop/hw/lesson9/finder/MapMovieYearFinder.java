package com.bvan.oop.hw.lesson9.finder;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author bvanchuhov
 */
public class MapMovieYearFinder implements MovieYearFinder {

    private final SortedMap<Integer, List<Movie>> releaseYearToMovies = new TreeMap<>();

    @Override
    public List<Movie> findByReleaseYear(int releaseYear) {
        List<Movie> movies = releaseYearToMovies.get(releaseYear);
        return movies != null ? movies : Collections.emptyList();
    }

    @Override
    public void add(Movie movie) {
        int releaseYear = movie.getReleaseYear();
        List<Movie> movies = releaseYearToMovies.get(releaseYear);
        if (movies == null) {
            List<Movie> newMovies = new LinkedList<>();
            newMovies.add(movie);
            releaseYearToMovies.put(releaseYear, newMovies);
        } else {
            movies.add(movie);
        }
    }

    @Override
    public List<Movie> findByReleaseYears(int minReleaseYear, int maxReleaseYear) {
        Collection<List<Movie>> moviesByYears = releaseYearToMovies.subMap(minReleaseYear, maxReleaseYear).values();
        List<Movie> res = new LinkedList<>();
        for (List<Movie> moviesForYear : moviesByYears) {
            res.addAll(moviesForYear);
        }
        return res;
    }
}
