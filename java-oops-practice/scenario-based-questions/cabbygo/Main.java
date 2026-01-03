import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Driver details
        System.out.print("Enter Driver Name: ");
        String driverName = sc.nextLine();

        System.out.print("Enter License Number: ");
        String license = sc.nextLine();

        System.out.print("Enter Driver Rating: ");
        double rating = sc.nextDouble();

        Driver driver = new Driver(driverName, license, rating);

        // Vehicle selection
        System.out.println("\nSelect Vehicle Type:");
        System.out.println("1. Mini");
        System.out.println("2. Sedan");
        System.out.println("3. SUV");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        Vehicle vehicle = null;

        switch (choice) {
            case 1:
                vehicle = new Mini(vehicleNumber);
                break;
            case 2:
                vehicle = new Sedan(vehicleNumber);
                break;
            case 3:
                vehicle = new SUV(vehicleNumber);
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Mini.");
                vehicle = new Mini(vehicleNumber);
        }

        // Distance input
        System.out.print("\nEnter distance (in km): ");
        double distance = sc.nextDouble();

        // Ride booking
        RideService ride = new RideService(vehicle);

        System.out.println("\n--- Ride Details ---");
        vehicle.showVehicleDetails();
        driver.showDriverDetails();

        ride.bookRide(distance);
        ride.endRide();

        sc.close();
    }
}
