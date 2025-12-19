import java.util.*;

public class FizzBuzz {
	public static void main(String[] args) {

		// Created Scanner object
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any natural number");
		int number = sc.nextInt();

		// Validate natural number
		if (number < 1) {
			System.err.println("Invalid Number. Enter Natural Number greater than zero only");
			System.exit(0);
		}

		// Create array of Strings
		String Array[] = new String[number+1];

		// Check Multiples of 3, 5 and Both from 0 to number
		for (int i = 1; i <= number; i++) {
			if ((i % 3 == 0) && ( i % 5 ==0) ){
				Array[i]= "FizzBuzz";
			}
			else if (i % 3 == 0) {
				Array[i]= "Fizz";
			} 
			else if( i % 5 ==0 ) {
				Array[i]= "Buzz";
			}
			else {
				Array[i] = String.valueOf(i);
			}
		}

		// Print Array
		System.out.println("The elements of Array are:");
		for (int i = 1; i <= number; i++) {
			System.out.println("Position " + i + " = " + Array[i]);
		}

		// Close Scanner
		sc.close();
	}
}