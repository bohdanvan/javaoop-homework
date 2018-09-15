package com.bvan.oop.hw.lesson5.shortfilesystem;

/**
 * @author bvanchuhov
 */
public class FSRunner {

    public static void main(String[] args) {
        Directory classicDir = new Directory("classic");
        classicDir.add(new File("beethoven-symphony9.mp3", 4000));

        Directory rockDir = new Directory("rock");
        rockDir.add(new File("wind-of-change.mp3", 2000));
        rockDir.add(new File("riders-on-the-storm.mp3", 2500));

        Directory musicDir = new Directory("music");
        musicDir.add(classicDir);
        musicDir.add(rockDir);
        musicDir.add(new File("unknown-music.mp3", 500));

        System.out.println(classicDir.getSize()); // 4000
        System.out.println(rockDir.getSize()); // 4500
        System.out.println(musicDir.getSize()); // 9000
    }
}
