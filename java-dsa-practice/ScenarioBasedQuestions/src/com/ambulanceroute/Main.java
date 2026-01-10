package com.ambulanceroute;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Ambulance route = new Ambulance();

        int choice = 0;

        while (true) {

            System.out.println("\n========= Ambulance Route System =========");
            System.out.println("1. Add Hospital Unit");
            System.out.println("2. Display Hospital Route");
            System.out.println("3. Find Available Unit (Ambulance Arrival)");
            System.out.println("4. Remove Unit (Maintenance)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // SAFE input handling
            String input = sc.nextLine();

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter Unit Name: ");
                    String name = sc.nextLine();

                    System.out.print("Is unit available? (true/false): ");
                    boolean available = Boolean.parseBoolean(sc.nextLine());

                    route.addUnit(name, available);
                    System.out.println("Unit added successfully.");
                    break;

                case 2:
                    route.displayRoute();
                    break;

                case 3:
                    System.out.println("\nAmbulance Arrival:");
                    route.findAvailableUnit();
                    break;

                case 4:
                    System.out.print("Enter unit name to remove: ");
                    String removeUnit = sc.nextLine();

                    route.removeUnit(removeUnit);
                    break;

                case 5:
                    System.out.println("Exiting system.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
