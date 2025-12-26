import java.util.*;

// Creating a public class
public class ElectionBooth {

    // Method to take check age
    public static void checkAge() {

        // Scanner object is created to take input from user
        Scanner sc = new Scanner(System.in);

        // Variable to store user choice (yes or exit)
        String input;


        // While loop to serve multiple users
        while (true) {

            // Asking user whether to continue or exit
            System.out.println("\nEnter 'yes' to vote or 'exit' for exit");
            input = sc.next();

            // If user types exit, program will stop
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thank you");
                break;
            }

            // Taking age input from user
            System.out.println("Enter the the age:");
            int age = sc.nextInt();
			
			if(age>=18)
			{
				System.out.println("Eligible for vote");
			}
			else
			{
                   
                   System.out.println(" Not Eligible for vote");
			}
           
            
         
        }

        // Closing the scanner
        sc.close();
    }

    // Main method
    public static void main(String args[]) {

        // Calling the method
        checkAge();
    }
}
