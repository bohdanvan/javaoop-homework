package com.bvan.oop.hw.lesson5.filesystem;

/**
 * @author bvanchuhov
 */
public class FileSystemRunner {

    public static void main(String[] args) {
        File file = new File("hello.txt", 10);
        Symlink symlink = new Symlink("my-doc.txt", file);
        System.out.println(symlink.getName()); // my-doc.txt -> hello.txt

        //---------------------

        Directory dir = new Directory("music")
                .add(new Directory("classic")
                        .add(new File("beethoven-symphony9.mp3", 4000))
                )
                .add(new Directory("rock")
                        .add(new File("wind-of-change.mp3", 2000))
                        .add(new File("riders-on-the-storm.mp3", 2500))
                )
                .add(new File("unknown-music.mp3", 500));

        System.out.println(dir.getSize()); // 9000

        //---------------------

        Directory d1 = new Directory("d1");

        Directory d2 = new Directory("d2");
        d2.add(d1);

        d1.add(d2); // IllegalArgumentException
    }
}
