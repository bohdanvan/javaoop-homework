package com.bvan.oop.hw.lesson10.linenumerator;

import java.io.IOException;

/**
 * @author bvanchuhov
 */
public class Runner {

    public static void main(String[] args) throws IOException {
        String inFileName = "files/hamlet.txt";
        String outFileName = "files/hamlet-with-line-nums.txt";
        new FileLineNumerator(inFileName, outFileName).runLineNumeration();
    }
}
