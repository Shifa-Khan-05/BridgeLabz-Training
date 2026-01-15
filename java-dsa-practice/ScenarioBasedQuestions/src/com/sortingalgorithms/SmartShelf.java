package com.sortingalgorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartShelf {

	    public static void insertionSort(ArrayList<String> books) {
	        int n = books.size();

	        for (int i = 1; i < n; i++) {
	            String key = books.get(i);
	            int j = i - 1;

	            // Shift elements that are greater than key
	            while (j >= 0 && books.get(j).compareToIgnoreCase(key) > 0) {
	                books.set(j + 1, books.get(j));
	                j--;
	            }

	            // Place key at correct position
	            books.set(j + 1, key);
	        }
	    }

	    public static void main(String[] args) {
	    	//System.out.println("hello");
	        ArrayList<String> books = new ArrayList<>();
	        Scanner scanner=new Scanner(System.in);
//	        books.add("Java Programming");
//	        books.add("Data Structures");
//	        books.add("Algorithms");
//	        books.add("Operating Systems");
//	        books.add("Computer Networks");
	        
	        String title;
	        
	        while(true)
	        {
	        	System.out.println("Enter the title fo the book , enter exit for break");
	        	title=scanner.nextLine();
	        	if(title.equalsIgnoreCase("exit"))
	        	{
	        		break;
	        	}
	        	books.add(title);
	        	
	        }

	        insertionSort(books);

	        System.out.println("Books in Alphabetical Order:");
//	        for (String book : books) {
//	            System.out.println(book);
//	        }
	        System.out.println(books);
	    }
	}
