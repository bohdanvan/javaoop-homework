package com.bvan.oop.hw.lesson6.account.exception;

/**
 * @author bvanchuhov
 */
public class AccountExpiredException extends AccountException {

    public AccountExpiredException(String message) {
        super(message);
    }

    public AccountExpiredException(String message, Throwable cause) {
        super(message, cause);
    }
}
