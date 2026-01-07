import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- Parking Slot Details --------
        System.out.print("Enter Parking Slot ID: ");
        String slotId = sc.nextLine();

        System.out.print("Allowed Vehicle Type (Car/Bike/Truck): ");
        String allowedType = sc.nextLine();

        ParkingSlot slot = new ParkingSlot(slotId, allowedType);

        // -------- Vehicle Details --------
        System.out.print("Enter Vehicle Type (Car/Bike/Truck): ");
        String vehicleType = sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        Vehicle vehicle;

        // -------- Polymorphic Object Creation --------
        if (vehicleType.equalsIgnoreCase("Car")) {
            vehicle = new Car(vehicleNumber);
        } else if (vehicleType.equalsIgnoreCase("Bike")) {
            vehicle = new Bike(vehicleNumber);
        } else {
            vehicle = new Truck(vehicleNumber);
        }

        ParkingManager manager = new ParkingManager();

        // -------- Parking Process --------
        if (manager.parkVehicle(slot, vehicle)) {

            System.out.print("Enter Parking Duration (in hours): ");
            int hours = sc.nextInt();

            manager.unparkVehicle(slot, vehicle, hours);
        }

        // -------- Logs --------
        manager.showLogs();

        sc.close();
    }
}
