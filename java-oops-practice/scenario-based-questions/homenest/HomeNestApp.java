import java.util.Scanner;

public class HomeNestApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Device device = null;

        System.out.println("=== HomeNest Smart Device Manager ===");
        System.out.println("Choose Device Type:");
        System.out.println("1. Light");
        System.out.println("2. Camera");
        System.out.println("3. Thermostat");
        System.out.println("4. Lock");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Device ID: ");
        String id = sc.nextLine();

        // Polymorphic object creation
        switch (choice) {
            case 1: device = new Light(id); break;
            case 2: device = new Camera(id); break;
            case 3: device = new Thermostat(id); break;
            case 4: device = new Lock(id); break;
            default:
                System.out.println("Invalid device choice");
                System.exit(0);
        }

        int option;
        do {
            System.out.println("\n--- Device Control Menu ---");
            System.out.println("1. Turn ON");
            System.out.println("2. Turn OFF");
            System.out.println("3. Reset Device");
            System.out.println("4. Calculate Energy Usage");
            System.out.println("5. Show Device Details");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    device.turnOn();
                    break;
                case 2:
                    device.turnOff();
                    break;
                case 3:
                    device.reset(); // Polymorphism
                    break;
                case 4:
                    System.out.print("Enter hours used: ");
                    double hours = sc.nextDouble();
                    System.out.println("Energy Used: " + device.calculateEnergy(hours) + " units");
                    break;
                case 5:
                    device.showDetails();
                    break;
                case 6:
                    System.out.println("Exiting HomeNest...");
                    break;
                default:
                    System.out.println("Invalid option");
            }

        } while (option != 6);

        sc.close();
    }
}
