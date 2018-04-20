package com.bvan.oop.hw.lesson3.music;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class Playlist {

    private final String title;
    private final ArrayList<Song> songs = new ArrayList<>();

    public Playlist(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public long getTotalLength() {
        long totalLength = 0;
        for (Song song : songs) {
            totalLength += song.getLength();
        }
        return totalLength;
    }

    public ArrayList<Song> findByTitlePart(String titlePart) {
        ArrayList<Song> res = new ArrayList<>();
        for (Song song : songs) {
            if (song.getTitle().contains(titlePart)) {
                res.add(song);
            }
        }
        return res;
    }

    public ArrayList<Song> findByAuthor(String author) {
        ArrayList<Song> res = new ArrayList<>();
        for (Song song : songs) {
            if (song.getAuthor().equals(author)) {
                res.add(song);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "title='" + title + '\'' +
                ", songs=" + songs +
                '}';
    }
}
