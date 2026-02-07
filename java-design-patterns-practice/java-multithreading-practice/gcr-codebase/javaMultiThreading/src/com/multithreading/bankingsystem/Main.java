package com.multithreading.bankingsystem;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(new Transaction(account, "Customer-1", 3000), "Customer-1");
        Thread t2 = new Thread(new Transaction(account, "Customer-2", 4000), "Customer-2");
        Thread t3 = new Thread(new Transaction(account, "Customer-3", 2000), "Customer-3");
        Thread t4 = new Thread(new Transaction(account, "Customer-4", 5000), "Customer-4");
        Thread t5 = new Thread(new Transaction(account, "Customer-5", 1500), "Customer-5");

        // Display thread states BEFORE execution
        System.out.println("Thread States Before Start:");
        System.out.println(t1.getName() + " : " + t1.getState());
        System.out.println(t2.getName() + " : " + t2.getState());
        System.out.println(t3.getName() + " : " + t3.getState());
        System.out.println(t4.getName() + " : " + t4.getState());
        System.out.println(t5.getName() + " : " + t5.getState());
        System.out.println("----------------------------------");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        System.out.println("----------------------------------");
        System.out.println("Final Account Balance: " + account.getBalance());
    }
}
