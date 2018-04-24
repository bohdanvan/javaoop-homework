package com.bvan.oop.hw.lesson10.cloner;

/**
 * @author bvanchuhov
 */
public class CloningException extends RuntimeException {

    public CloningException(String message) {
        super(message);
    }

    public CloningException(String message, Throwable cause) {
        super(message, cause);
    }
}
