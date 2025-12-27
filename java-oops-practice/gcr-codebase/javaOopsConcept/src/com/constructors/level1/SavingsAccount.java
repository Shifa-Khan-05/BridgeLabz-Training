package com.constructors.level1;

//Creating subclass SavingsAccount
class SavingsAccount extends BankAccount {

 double interestRate;

 // Constructor of SavingsAccount class
 public SavingsAccount(int accountNumber, String accountHolder,
                       double balance, double interestRate) {
     super(accountNumber, accountHolder, balance);
     this.interestRate = interestRate;
 }

 // Method to display savings account details
 public void displaySavingsAccountDetails() {

     // Accessing public variable
     System.out.println("Account Number : " + accountNumber);

     // Accessing protected variable
     System.out.println("Account Holder : " + accountHolder);

     // Accessing private variable using getter
     System.out.println("Balance        : ₹" + getBalance());

     System.out.println("Interest Rate  : " + interestRate + "%");
 }

 // Main method
 public static void main(String[] args) {

     // Creating SavingsAccount object
     SavingsAccount sa = new SavingsAccount(
             123456,
             "Maya Sharma",
             50000.0,
             4.5
     );

     // Modifying balance using public method
     sa.setBalance(55000.0);

     // Displaying account details
     sa.displaySavingsAccountDetails();
 }
}

