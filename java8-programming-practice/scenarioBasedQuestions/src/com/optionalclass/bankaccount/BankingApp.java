package com.optionalclass.bankaccount;

import java.util.Optional;

public class BankingApp {

    public static void main(String[] args) {

        Optional<String> nominee = Optional.empty();
        Optional<String> loanDetails = Optional.of("Home Loan");
        Double balance = null;
        Optional<String> transactionRef = Optional.empty();
        Optional<String> creditCard = Optional.of("Visa Platinum");

        System.out.println("==============================================");

        // 1. Fetch nominee details
        nominee.ifPresentOrElse(
                n -> System.out.println("Nominee: " + n),
                () -> System.out.println("No nominee assigned")
        );

        System.out.println("==============================================");

        // 2. Fetch loan details
        loanDetails.ifPresent(
                loan -> System.out.println("Loan Details: " + loan)
        );

        System.out.println("==============================================");

        // 3. Balance check with default minimum
        double finalBalance =
                Optional.ofNullable(balance).orElse(1000.0);
        System.out.println("Account Balance: " + finalBalance);

        System.out.println("==============================================");

        // 4. Transaction reference
        System.out.println(
                transactionRef.orElse("Transaction reference not available")
        );

        System.out.println("==============================================");

        // 5. Credit card details
        creditCard.ifPresent(
                card -> System.out.println("Credit Card: " + card)
        );
    }
}
