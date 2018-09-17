package com.bvan.oop.hw.lesson6.parser;

/**
 * @author bvanchuhov
 */
public class IllegalLastNameException extends IllegalFullNameException {

    public IllegalLastNameException() {
    }

    public IllegalLastNameException(String message) {
        super(message);
    }

    public IllegalLastNameException(String message, Throwable cause) {
        super(message, cause);
    }
}
