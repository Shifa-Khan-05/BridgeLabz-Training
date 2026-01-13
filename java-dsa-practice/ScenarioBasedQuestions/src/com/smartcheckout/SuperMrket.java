package com.smartcheckout;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class SuperMrket {
	Queue<Customer> customers = new LinkedList<>();
    Map<String, Integer> priceMap = new HashMap<>();
    Map<String, Integer> stockMap = new HashMap<>();

	
	public SuperMrket() {
        priceMap.put("milk", 50);
        priceMap.put("bread", 40);
        priceMap.put("oil", 500);
        priceMap.put("apple", 80);
        priceMap.put("biscuit", 50);
        priceMap.put("flour", 500);
        priceMap.put("noodles", 90);
        priceMap.put("poha", 70);

        // Initial stock
        for (String item : priceMap.keySet()) {
            stockMap.put(item, 10);
        }
    }
	
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
		
	}
	public void processCustomer() {
		if(customers.isEmpty())
		{
			System.out.println("No customer is in the queue");
			return;
		}
		Customer customer=customers.poll();
		int bill=0;
	
		for(String item :customer.items) {
			if(!priceMap.containsKey(item))
			{
				System.out.println("item not available");
				continue;
			}
			if(stockMap.get(item)<=0)
			{
				System.out.println("Item out of staock");
				continue;
			}
			
			int price =priceMap.get(item);
			bill+=price;
		}
		System.out.println("Total bill - " + bill);
		
	}
	
	 public void displayStock() {
	        System.out.println(" Current Stock:");
	        for (String item : stockMap.keySet()) {
	            System.out.println(item + " : " + stockMap.get(item));
	        }
	    }
	
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        SuperMrket market = new SuperMrket();

	        int choice;
	        do {
	            System.out.println("\n=== SMART CHECKOUT MENU ===");
	            System.out.println("1. Add Customer");
	            System.out.println("2. Process Customer");
	            System.out.println("3. View Stock");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");

	            choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter customer name: ");
	                    String name = sc.nextLine();
	                    Customer customer = new Customer(name);

	                    System.out.print("Enter number of items: ");
	                    int n = sc.nextInt();
	                    sc.nextLine();

	                    for (int i = 0; i < n; i++) {
	                        System.out.print("Enter item name: ");
	                        customer.addItem(sc.nextLine());
	                    }

	                    market.addCustomer(customer);
	                    break;

	                case 2:
	                    market.processCustomer();
	                    break;

	                case 3:
	                    market.displayStock();
	                    break;

	                case 4:
	                    System.out.println("Exiting SmartCheckout...");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }

	        } while (choice != 4);

	        sc.close();
	    }
}
