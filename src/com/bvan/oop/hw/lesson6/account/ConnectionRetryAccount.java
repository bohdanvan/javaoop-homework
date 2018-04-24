package com.bvan.oop.hw.lesson6.account;

import com.bvan.oop.hw.lesson6.account.exception.AccountConnectionException;
import com.bvan.oop.hw.lesson6.account.exception.AccountException;

/**
 * @author bvanchuhov
 */
public class ConnectionRetryAccount implements Account {

    private final Account account;
    private final int retries;

    public ConnectionRetryAccount(Account account, int retries) {
        if (retries <= 0) {
            throw new IllegalArgumentException("number of retries should be > 0: " + retries);
        }
        this.account = account;
        this.retries = retries;
    }

    @Override
    public void withdraw(long money) throws AccountException {
        withdraw(money, retries);
    }

    private void withdraw(long money, int retriesLeft) throws AccountException {
        try {
            account.withdraw(money);
        } catch (AccountConnectionException e) {
            if (retriesLeft > 0) {
                withdraw(money, retriesLeft - 1);
            } else {
                int attempts = retries + 1;
                throw new AccountConnectionException("connection is lost. " + attempts + " attempts were made", e);
            }
        }
    }
}
