package com.lambdaexpression.bankingsystem;

import java.util.Comparator;
import java.util.function.*;

public class BankingLambdaDemo {

    public static void main(String[] args) {

        Account a1 = new Account("Amit", 8000);
        Account a2 = new Account("Sneha", 15000);

        // 1. Minimum balance check
        Predicate<Account> minBalance =
                a -> a.balance >= 5000;
        System.out.println(minBalance.test(a1));

        // 2. Simple interest
        Function<Double, Double> interest =
                p -> p * 0.05;
        System.out.println("Interest: " + interest.apply(a2.balance));

        // 3. Validate withdrawal
        BiPredicate<Account, Double> withdrawValid =
                (a, amt) -> amt <= a.balance;
        System.out.println(withdrawValid.test(a1, 3000.0));

        // 4. Print account details
        Consumer<Account> printAccount =
                a -> System.out.println(a.holder + " " + a.balance);
        printAccount.accept(a1);

        // 5. Compare two account balances
        Comparator<Account> compareBalance =
                (x, y) -> Double.compare(x.balance, y.balance);
        System.out.println(compareBalance.compare(a1, a2));
    }
}
