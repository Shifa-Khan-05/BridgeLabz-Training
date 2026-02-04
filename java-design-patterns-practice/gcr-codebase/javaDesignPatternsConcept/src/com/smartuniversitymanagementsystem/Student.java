package com.smartuniversitymanagementsystem;

public class Student implements Users {
    
    @Override
    public void functionality() {
    	System.out.println(" Students who can borrow books for limited days");
    	
    }
    
    public void borrowBook() {
		System.out.println("Book borrowed successfully!!");
	}
}
