package com.encapsulationandpolymorphism.vehiclerentalsystem;

import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
	
	   ArrayList<Vehicle> vehicles=new ArrayList<Vehicle>();
	   vehicles.add(new Car(1234, 40, "1234dv"));
	   vehicles.add(new Bike(123, 100, "12xcc"));
	   vehicles.add(new Truck(1578, 60, "5sdfvg55"));
	   
	   int days = 3;

       for (Vehicle v : vehicles) {
           System.out.println("Vehicle Type: " + v.getType());
           System.out.println("Rental Cost: " + v.calculateRentalCost(days));
           v.getInsuranceDetails();
       }  
    }
}
