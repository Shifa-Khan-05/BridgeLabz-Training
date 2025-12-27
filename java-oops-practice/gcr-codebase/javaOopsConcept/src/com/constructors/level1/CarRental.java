package com.constructors.level1;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double ratePerDay = 1500;

    // Default constructor
    public CarRental() {
        customerName = "Customer";
        carModel = "Hatchback";
        rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateCost() {
        return rentalDays * ratePerDay;
    }

    void display() {
        System.out.println(customerName + "  " + carModel +
                "  Days: " + rentalDays +
                "  Total: ₹" + calculateCost());
    }
    public static void main(String[] args) {
		CarRental carRental=new CarRental("Abhay","Maruti",5);
		carRental.display();
	}
}
