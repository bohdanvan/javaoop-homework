package com.bvan.oop.hw.lesson6.account.exception;

/**
 * @author bvanchuhov
 */
public class AccountException extends Exception {

    public AccountException(String message) {
        super(message);
    }

    public AccountException(String message, Throwable cause) {
        super(message, cause);
    }
}
