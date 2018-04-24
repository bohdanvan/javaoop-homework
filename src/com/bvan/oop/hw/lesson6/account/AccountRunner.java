package com.bvan.oop.hw.lesson6.account;

import com.bvan.oop.hw.lesson6.account.exception.AccountException;

/**
 * @author bvanchuhov
 */
public class AccountRunner {

    public static void main(String[] args) throws AccountException {
        Account checkAccount = new ConnectionRetryAccount(new RandomAccount(0.1, 0.1, 0.7),4);
        checkAccount.withdraw(100);
    }
}
