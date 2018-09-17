package com.bvan.oop.hw.lesson6.parser;

/**
 * @author bvanchuhov
 */
public class IllegalFullNameException extends RuntimeException {

    public IllegalFullNameException() {
    }

    public IllegalFullNameException(String message) {
        super(message);
    }

    public IllegalFullNameException(String message, Throwable cause) {
        super(message, cause);
    }
}
