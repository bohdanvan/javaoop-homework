package com.bvan.oop.hw.lesson6.account;

import com.bvan.oop.hw.lesson6.account.exception.AccountException;

/**
 * @author bvanchuhov
 */
public interface Account {

    void withdraw(long money) throws AccountException;
}
