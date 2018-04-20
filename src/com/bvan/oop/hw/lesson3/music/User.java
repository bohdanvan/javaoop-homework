package com.bvan.oop.hw.lesson3.music;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class User {

    private final String name;
    private final ArrayList<Playlist> playlists = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Playlist createPlaylist(String title) {
        Playlist playlist = new Playlist(title);
        playlists.add(playlist);
        return playlist;
    }

    /**
     * @return playlist or null if not found.
     */
    public Playlist findByTitle(String title) {
        for (Playlist playlist : playlists) {
            if (playlist.getTitle().equals(title)) {
                return playlist;
            }
        }
        return null;
    }

    public void addSongToPlaylist(String playlistTitle, Song song) {
        Playlist playlist = findByTitle(playlistTitle);
        if (playlist != null) {
            playlist.addSong(song);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", playlists=" + playlists +
                '}';
    }
}
