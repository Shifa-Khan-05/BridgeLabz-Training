package com.constructors.level1;

//Creating a class named Vehicle
public class Vehicle {

 // Instance variables (different for each vehicle)
 String ownerName;
 String vehicleType;

 // Class variable (same for all vehicles)
 static double registrationFee = 5000;

 // Constructor to initialize instance variables
 Vehicle(String ownerName, String vehicleType) {
     this.ownerName = ownerName;
     this.vehicleType = vehicleType;
 }

 // Instance method to display vehicle details
 // This method displays details of a particular vehicle
 public void displayVehicleDetails() {
     System.out.println("Owner Name       : " + ownerName);
     System.out.println("Vehicle Type     : " + vehicleType);
     System.out.println("Registration Fee : ₹" + registrationFee);
     System.out.println("------------------------------");
 }

 // Class method to update registration fee
 // This method changes the registration fee for all vehicles
 public static void updateRegistrationFee(double newFee) {
     registrationFee = newFee;
 }

 // Main method
 public static void main(String[] args) {

     // Creating vehicle objects
     Vehicle v1 = new Vehicle("Ravi Kumar", "Car");
     Vehicle v2 = new Vehicle("Maya Sharma", "Bike");

     // Displaying vehicle details before updating fee
     v1.displayVehicleDetails();
     v2.displayVehicleDetails();

     // Updating registration fee using class method
     Vehicle.updateRegistrationFee(6500);

     // Displaying vehicle details after updating fee
     v1.displayVehicleDetails();
     v2.displayVehicleDetails();
 }
}
