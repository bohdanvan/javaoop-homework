package com.bvan.oop.hw.lesson10.linenumerator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author bvanchuhov
 */
public class FileLineNumerator {

    private final String inFileName;
    private final String outFileName;

    public FileLineNumerator(String inFileName, String outFileName) {
        this.inFileName = inFileName;
        this.outFileName = outFileName;
    }

    public void runLineNumeration() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outFileName))) {

            int i = 1;
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(i + ": " + line);
                writer.newLine();

                i++;
            }
        }
    }
}
