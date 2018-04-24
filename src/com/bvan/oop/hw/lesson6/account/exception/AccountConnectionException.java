package com.bvan.oop.hw.lesson6.account.exception;

/**
 * @author bvanchuhov
 */
public class AccountConnectionException extends AccountException {

    public AccountConnectionException(String message) {
        super(message);
    }

    public AccountConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
