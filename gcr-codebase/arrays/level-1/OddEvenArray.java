import java.util.*;

public class OddEvenArray {
	public static void main(String[] args) {

		// Create Scanner object
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any natural number");
		int number = sc.nextInt();

		// Validate natural number
		if (number < 1) {
			System.err.println("Invalid Number. Enter Natural Number greater than zero only");
			System.exit(0);
		}

		// Create arrays
		int OddArray[] = new int[(number / 2) + 1];
		int EvenArray[] = new int[(number / 2) + 1];

		// Index counters
		int oddIndex = 0;
		int evenIndex = 0;

		// Store odd and even numbers
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				EvenArray[evenIndex++] = i;   // FIXED
			} else {
				OddArray[oddIndex++] = i;     // FIXED
			}
		}

		// Print EvenArray
		System.out.println("The elements of EvenArray are:");
		for (int i = 0; i < evenIndex; i++) {
			System.out.print(EvenArray[i] + " ");
		}

		// Print OddArray
		System.out.println("\nThe elements of sOddArray are:");
		for (int i = 0; i < oddIndex; i++) {
			System.out.print(OddArray[i] + " ");
		}

		// Close Scanner
		sc.close();
	}
}