package com.smartcheckout;
import java.util.Scanner;
import java.util.LinkedList;

// Represents a customer in the billing queue
public class Customer {

    String customerName;
    LinkedList<String> items;   // List of items purchased

    public Customer(String customerName) {
        this.customerName = customerName;
        this.items = new LinkedList<>();
    }

    // Add item to customer's cart
    public void addItem(String item) {
        items.add(item);
    }
    
    
   
}
