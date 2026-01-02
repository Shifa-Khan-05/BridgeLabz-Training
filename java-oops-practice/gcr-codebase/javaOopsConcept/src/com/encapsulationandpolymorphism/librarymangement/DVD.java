package com.encapsulationandpolymorphism.librarymangement;

public class DVD extends LibraryItem{
	

	    public DVD(int id, String title, String author) {
	        super(id, title, author);
	    }

	    @Override
	    public int getLoanDuration() {
	        return 3; // short loan period
	    }
	}
