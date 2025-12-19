// Created a MeanHeight Class to calculate the Mean Height  
// of the football team players by using an array
import java.util.*;
public class MeanHeight {
	public static void main (String [] args){
		// Create a Scanner Object
		Scanner sc = new Scanner(System.in);
		
		// created a double array of size 11, to store height of 
		// individual player
		double array [] = new double[11];
		
		System.out.println("Enter the heights of all the 11 players ");
		
		// For loop to take input from the user and store 
	    // them into the Array
		for(int i=0; i<array.length; i++){
			array[i] = sc.nextDouble();
		// Validate the user input number, if negative state invalid and exit 
		if (array[i] < 0) {
				System.err.println("Invalid Number.");
				System.exit(0);
			}
		}
		
		// Initialized the variable sub and assigned 0 to store the 
		// sum of heights of all the players 
		double sum =0;
		
		// For loop to calculate the total sum of  
	    // heights of all the players
		for(int i=0; i<array.length; i++){
			sum+=array[i];
		}
		
		double meanHeight = sum/11;
		
		// Print the Mean Height of the Players of Football Team
		System.out.println("The Mean Height of the players of Football team is " + meanHeight);
			
		// Close the Scanner Object
		sc.close();
		
	}
}