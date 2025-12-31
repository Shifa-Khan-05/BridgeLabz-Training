/*
20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.
*/


import java.util.*;
    public class DiwaliMela {

	public static void diwaliMela() {

		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println("====================================");
			System.out.println("    ***Welcome to Diwali Mela***    ");
			System.out.println("====================================");
			System.out.println(" You can get a Gift!!!! ");
			System.out.println(" Choose any number");
			System.out.println();
			number = sc.nextInt();
			if (number % 3 == 0 && number % 5 == 0) {
				System.out.println(" Hurraayyyhhhhhh!!! you got a Gift....");
			} else {
				System.out.println(" Sorry!!! Bad luck!!");
				System.out.println();
			}

		} while (number > 0);

	}

	public static void main(String args[]) {

		diwaliMela();

	}
}
