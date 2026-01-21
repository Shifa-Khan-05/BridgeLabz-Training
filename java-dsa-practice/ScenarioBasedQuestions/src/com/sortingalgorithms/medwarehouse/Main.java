package com.sortingalgorithms.medwarehouse;
import java.time.LocalDate;
public class Main {

	    public static void main(String[] args) {

	        Warehouse warehouse = new Warehouse();

	        warehouse.addMedicine(new Meicines("Paracetamol",
	                LocalDate.of(2025, 5, 20)));
	        warehouse.addMedicine(new Meicines("Cough Syrup",
	                LocalDate.of(2024, 12, 10)));
	        warehouse.addMedicine(new Meicines("Antibiotic",
	                LocalDate.of(2024, 8, 15)));
	        warehouse.addMedicine(new Meicines("Vitamin Tablets",
	                LocalDate.of(2026, 1, 5)));

	        warehouse.sortByExpiry();
	        warehouse.displayMedicines();
	    }
	}
