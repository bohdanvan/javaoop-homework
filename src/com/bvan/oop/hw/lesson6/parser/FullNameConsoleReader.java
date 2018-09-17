package com.bvan.oop.hw.lesson6.parser;

/**
 * @author bvanchuhov
 */
public interface FullNameConsoleReader {

    /**
     * Reads full name from the console.
     * If an input is incorrect, prints the cause of an error (illegal first name, illegal last name etc)
     * and tries to read again.
     *
     * @return a full name, that is successfully read from the console.
     */
    FullName read();
}
