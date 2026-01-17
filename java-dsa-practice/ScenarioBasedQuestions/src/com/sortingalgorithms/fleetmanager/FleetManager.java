package com.sortingalgorithms.fleetmanager;

	import java.util.ArrayList;
	import java.util.List;

	/**
	 * FleetManager system that merges multiple
	 * sorted vehicle lists using Merge Sort.
	 */
	public class FleetManager {

	    /**
	     * Merge Sort method to sort vehicles by mileage.
	     */
	    public static void mergeSort(List<Vehicle> vehicles) {

	        // Base condition
	        if (vehicles.size() <= 1)
	            return;

	        int mid = vehicles.size() / 2;

	        // Split list into two halves
	        List<Vehicle> left = new ArrayList<>(vehicles.subList(0, mid));
	        List<Vehicle> right = new ArrayList<>(vehicles.subList(mid, vehicles.size()));

	        // Recursively sort both halves
	        mergeSort(left);
	        mergeSort(right);

	        // Merge sorted halves
	        merge(vehicles, left, right);
	    }

	    /**
	     * Merges two sorted lists into one.
	     */
	    private static void merge(List<Vehicle> result,
	                              List<Vehicle> left,
	                              List<Vehicle> right) {

	        int i = 0, j = 0, k = 0;

	        // Compare and merge vehicles based on mileage
	        while (i < left.size() && j < right.size()) {

	            if (left.get(i).getMileage() <= right.get(j).getMileage()) {
	                result.set(k++, left.get(i++));
	            } else {
	                result.set(k++, right.get(j++));
	            }
	        }

	        // Copy remaining vehicles
	        while (i < left.size())
	            result.set(k++, left.get(i++));

	        while (j < right.size())
	            result.set(k++, right.get(j++));
	    }

	    public static void main(String[] args) {

	        ArrayList<Vehicle> vehicles = new ArrayList<>();

	        // Vehicles from different depots (already sorted)
	        vehicles.add(new Vehicle("Truck-1", 12000));
	        vehicles.add(new Vehicle("Van-3", 15000));
	        vehicles.add(new Vehicle("Car-2", 8000));
	        vehicles.add(new Vehicle("Bus-5", 20000));

	        // Create master maintenance schedule
	        mergeSort(vehicles);

	        System.out.println("Vehicle Maintenance Schedule (by mileage):");
	        for (Vehicle v : vehicles) {
	            System.out.println(v);
	        }
	    }
	

}
