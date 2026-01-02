package com.encapsulationandpolymorphism.banksystem;

import java.util.*;
public class Main {
	

	    public static void main(String[] args) {

	        List<BankAccount> accounts = new ArrayList<>();

	        accounts.add(new SavingsAccount("SB101", "Amit", 50000));
	        accounts.add(new CurrentAccount("CA202", "Riya", 80000));

	        for (BankAccount acc : accounts) {
	            System.out.println("Account Holder: " + acc.getHolderName());
	            System.out.println("Balance: " + acc.getBalance());
	            System.out.println("Interest Earned: " + acc.calculateInterest());

	            acc.applyForLoan(30000);
	           
	        }
	}

}
