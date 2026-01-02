package com.encapsulationandpolymorphism.ridehailingapplication;

import java.util.*;

public class Main {
	public static void main(String[] args) {

		List<Vehicle> rides = new ArrayList<>();

		rides.add(new Car(1, "Raj", 15));
		rides.add(new Bike(2, "Aman", 8));
		rides.add(new Auto(3, "Suresh", 10));

		double distance = 10;

		for (Vehicle v : rides) {
			v.getVehicleDetails();
			System.out.println("Fare: ₹" + v.calculateFare(distance));
			System.out.println("------------------------");
		}
	}
}
