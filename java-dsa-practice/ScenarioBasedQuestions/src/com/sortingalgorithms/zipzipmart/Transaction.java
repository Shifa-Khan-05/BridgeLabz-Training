package com.sortingalgorithms.zipzipmart;

	import java.time.LocalDate;
	import java.util.*;

	class Transaction {
	    LocalDate date;
	    int amount;

	    Transaction(LocalDate date, int amount) {
	        this.date = date;
	        this.amount = amount;
	    }

	    @Override
	    public String toString() {
	        return date + " -> " + amount;
	    }
	
}
