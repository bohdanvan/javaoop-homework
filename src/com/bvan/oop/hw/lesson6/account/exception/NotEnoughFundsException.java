package com.bvan.oop.hw.lesson6.account.exception;

/**
 * @author bvanchuhov
 */
public class NotEnoughFundsException extends AccountException {

    public NotEnoughFundsException(String message) {
        super(message);
    }

    public NotEnoughFundsException(String message, Throwable cause) {
        super(message, cause);
    }
}
