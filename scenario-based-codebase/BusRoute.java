/*
19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.
*/
import java.util.*;
public class BusRoute{
	 // Method to track distance covered across bus stops
	public static void calculateDistance(){
		Scanner sc = new Scanner(System.in);

        int stopNumber = 1;          // Keeps count of bus stops
        double totalDistance = 0.0;  // Stores total distance travelled
        char exitChoice = 'n';       // Stores user's decision to get off

        System.out.println("Bus Route Distance Tracker Started\n");

        // Continue journey until passenger decides to get off
        while (exitChoice != 'y' && exitChoice != 'Y') {

            System.out.println("Bus has reached Stop " + stopNumber);
            System.out.print("Enter distance covered to this stop (in km): ");
            double distance = sc.nextDouble();

            // Add current stop distance to total distance
            totalDistance += distance;

            System.out.println("Total distance travelled so far: " + totalDistance + " km");

            // Ask passenger if they want to exit at this stop
            System.out.print("Do you want to get off at this stop? (y/n): ");
            exitChoice = sc.next().charAt(0);

            stopNumber++; // Move to next stop
            System.out.println();
        }

        // Final summary after passenger exits
        System.out.println("Passenger got off the bus.");
        System.out.println("Total distance travelled: " + totalDistance + " km");
        System.out.println("Thank you for using the Bus Route Distance Tracker.");

        sc.close();
    }
	public static void main(String [] main){
		calculateDistance();
	}
}