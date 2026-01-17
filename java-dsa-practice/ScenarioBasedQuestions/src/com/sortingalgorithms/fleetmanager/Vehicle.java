package com.sortingalgorithms.fleetmanager;

public class Vehicle {
	/**
	 * Vehicle class representing fleet vehicles.
	 */

	    private String vehicleId;
	    private int mileage;

	    public Vehicle(String vehicleId, int mileage) {
	        this.vehicleId = vehicleId;
	        this.mileage = mileage;
	    }

	    public int getMileage() {
	        return mileage;
	    }

	    @Override
	    public String toString() {
	        return vehicleId + " | Mileage: " + mileage;
	    }
	
}
