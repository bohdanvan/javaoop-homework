package com.bvan.oop.hw.lesson3.music;

import java.util.Random;

/**
 * @author bvanchuhov
 */
public class MusicRunner {

    public static void main(String[] args) {
        User user = new User("Taras");

        Song song1 = new Song("Forever Young", "Alphaville", "lyrics", 240, randomAudioContent());
        Song song2 = new Song("Big in Japan", "Alphaville", "lyrics", 300, randomAudioContent());
        Song song3 = new Song("Baru", "GOX", "Rock", 240, randomAudioContent());
        Song song4 = new Song("Ye", "GOX", "lyrics", 300, randomAudioContent());

        Playlist playlist1 = user.createPlaylist("Tape1");
        playlist1.addSong(song1);
        playlist1.addSong(song2);
        playlist1.addSong(song3);
        playlist1.addSong(song4);

        Playlist playlist2 = user.createPlaylist("Tape2");
        playlist2.addSong(song3);
        playlist2.addSong(song4);

        System.out.println(playlist1.getTotalLength()); // 1080
        System.out.println(playlist1.findByTitlePart("Young")); // [Song{title='Forever Young', ...}]
        System.out.println();

        System.out.println(playlist2.getTotalLength()); // 540
        System.out.println(playlist2.findByTitlePart("Young")); // []
    }

    private static AudioContent randomAudioContent() {
        Random random = new Random();
        byte[] bytes = new byte[5];
        random.nextBytes(bytes);
        return new AudioContent(bytes);
    }
}
