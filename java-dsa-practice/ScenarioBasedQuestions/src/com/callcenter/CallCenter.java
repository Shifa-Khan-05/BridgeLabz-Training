package com.callcenter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CallCenter {

    // Normal customers (FIFO)
    private Queue<String> normalQueue = new LinkedList<>();

    // VIP customers (priority-based)
    private Queue<String> vipQueue = new PriorityQueue<>();

    // Call count per customer
    private HashMap<String, Integer> callData = new HashMap<>();

    // Add customer to appropriate queue
    public void addCustomer(String name, boolean isVip) {

        if (isVip) {
            vipQueue.add(name);
        } else {
            normalQueue.add(name);
        }

        // Update call count
        callData.put(name, callData.getOrDefault(name, 0) + 1);
    }

    // Serve next customer
    public void serveCustomer() {

        String customer;

        if (!vipQueue.isEmpty()) {
            customer = vipQueue.poll();
            System.out.println("Serving VIP customer: " + customer);
        } else if (!normalQueue.isEmpty()) {
            customer = normalQueue.poll();
            System.out.println("Serving normal customer: " + customer);
        } else {
            System.out.println("No customers in queue.");
        }
    }

    // Display call statistics
    public void displayCallData() {
        System.out.println("Monthly Call Data: " + callData);
    }

    public static void main(String[] args) {

        CallCenter center = new CallCenter();

        // Normal customers
        center.addCustomer("abc", false);
        center.addCustomer("abc", false);
        center.addCustomer("rahul", false);

        // VIP customers
        center.addCustomer("faiz", true);
        center.addCustomer("aman", true);

        // Serve calls
        center.serveCustomer();
        center.serveCustomer();
        center.serveCustomer();
        center.serveCustomer();
        center.serveCustomer();

        // Show call statistics
        center.displayCallData();
    }
}
