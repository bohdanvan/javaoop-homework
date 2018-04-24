package com.bvan.oop.hw.lesson6.account;

import com.bvan.oop.hw.lesson6.account.exception.AccountConnectionException;
import com.bvan.oop.hw.lesson6.account.exception.AccountException;
import com.bvan.oop.hw.lesson6.account.exception.AccountExpiredException;
import com.bvan.oop.hw.lesson6.account.exception.NotEnoughFundsException;

/**
 * @author bvanchuhov
 */
public class RandomAccount implements Account {

    private final double notEnoughFundsProbability;
    private final double accountExpiredProbability;
    private final double lostConnectionProbability;

    public RandomAccount(
            double accountExpiredProbability,
            double notEnoughFundsProbability,
            double lostConnectionProbability) {
        this.lostConnectionProbability = lostConnectionProbability;
        this.notEnoughFundsProbability = notEnoughFundsProbability;
        this.accountExpiredProbability = accountExpiredProbability;
    }

    @Override
    public void withdraw(long money) throws AccountException {
        double random = Math.random();
        if (random < notEnoughFundsProbability) {
            throw new NotEnoughFundsException("not enough money");
        }
        if (random < notEnoughFundsProbability + accountExpiredProbability) {
            throw new AccountExpiredException("account is expired");
        }
        if (random < notEnoughFundsProbability + accountExpiredProbability + lostConnectionProbability) {
            throw new AccountConnectionException("connection is lost");
        }
    }
}
