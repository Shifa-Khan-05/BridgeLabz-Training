package com.tree.avltree.onlineticketbooking;

public class Main {
	 public static void main(String[] args) {
		  EventAVLTree bookingSystem = new EventAVLTree();

	        bookingSystem.insert(new Event(1800, "Music Concert"));
	        bookingSystem.insert(new Event(1400, "Tech Conference"));
	        bookingSystem.insert(new Event(2000, "Stand-up Comedy"));
	        bookingSystem.insert(new Event(1600, "Art Exhibition"));

	        System.out.println("Upcoming Events:");
	        bookingSystem.displayUpcomingEvents();

	        System.out.println("\nCancelling event at 1600");
	        bookingSystem.delete(1600);

	        System.out.println("\nUpdated Upcoming Events:");
	        bookingSystem.displayUpcomingEvents();
	    
	}
}
