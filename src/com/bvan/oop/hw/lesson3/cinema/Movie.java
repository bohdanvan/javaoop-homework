package com.bvan.oop.hw.lesson3.cinema;

/**
 * @author bvanchuhov
 */
public class Movie {

    private final String title;
    private final int releaseYear;
    private final long duration;
    private final String description;

    public Movie(String title, int releaseYear, long duration, String description) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public long getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                '}';
    }
}
