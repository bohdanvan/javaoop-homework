package com.bvan.oop.hw.lesson6.parser;

/**
 * @author bvanchuhov
 */
public class Runner {

    public static void main(String[] args) {
        FullNameConsoleReader reader = new FullNameConsoleReaderImpl();
        FullName fullName = reader.read();
        System.out.println(fullName);
    }
}
