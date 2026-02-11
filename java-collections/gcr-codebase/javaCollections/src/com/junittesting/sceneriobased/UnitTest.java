package com.junittesting.sceneriobased;

import static org.junit.Assert.*;
import org.junit.Test;

public class UnitTest {

    @Test
    public void testDepositValidAmount() {

        BankAccount b = new BankAccount(1000000);
        b.depositAmount(5000.0);
        b.depositAmount(1000.0);

        assertEquals(1006000.00, b.getBalance(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositNegativeAmount() {

        BankAccount b = new BankAccount(1000000);
        b.depositAmount(-5000.0);
    }

    @Test
    public void testWithdrawValidAmount() {

        BankAccount b = new BankAccount(1000000);
        b.withdrawlAmount(5000.0);

        assertEquals(995000.00, b.getBalance(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawInsufficientFunds() {

        BankAccount b = new BankAccount(1000);
        b.withdrawlAmount(5000.0);
    }
}
