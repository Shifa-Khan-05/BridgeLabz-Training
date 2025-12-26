import java.util.*;

// Creating a public class
public class MayasBMIFitnessTracker {

    // Main method
    public static void main(String args[]) {

        // Scanner object is created to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking height input in meters
        System.out.println("Enter your height in meters:");
        double height = sc.nextDouble();

        // Taking weight input in kilograms
        System.out.println("Enter your weight in kilograms:");
        double weight = sc.nextDouble();

        // Calculating BMI using formula
        // BMI = weight / (height * height)
        double bmi = weight / (height * height);

        // Displaying the calculated BMI
        System.out.println("Your BMI is: " + bmi);

        // Checking BMI category using if-else conditions
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } 
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } 
        else {
            System.out.println("BMI Category: Overweight");
        }

        // Closing the scanner
        sc.close();
    }
}
