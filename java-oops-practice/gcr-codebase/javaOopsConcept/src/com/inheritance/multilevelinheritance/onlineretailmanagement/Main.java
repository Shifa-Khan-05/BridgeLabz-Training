package com.inheritance.multilevelinheritance.onlineretailmanagement;

public class Main {
	

	    public static void main(String[] args) {

	        Order o1 = new Order(101, "01-09-2025");
	        Order o2 = new ShippedOrder(102, "02-09-2025", "TRK78945");
	        Order o3 = new DeliveredOrder(103, "03-09-2025", "TRK45678", "05-09-2025");

	        System.out.println(o1.getOrderStatus());
	        System.out.println(o2.getOrderStatus());
	        System.out.println(o3.getOrderStatus());
	    
	}

}
