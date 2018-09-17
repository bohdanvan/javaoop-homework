package com.bvan.oop.hw.lesson6.parser;

/**
 * @author bvanchuhov
 */
public class IllegalFirstNameException extends IllegalFullNameException {

    public IllegalFirstNameException() {
    }

    public IllegalFirstNameException(String message) {
        super(message);
    }

    public IllegalFirstNameException(String message, Throwable cause) {
        super(message, cause);
    }
}
