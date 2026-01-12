package com.traincompanion;

import java.util.*;
public class Train {

    private Compartment head;
    private Compartment tail;

    // Insert compartment at end
    public void addCompartment(String name, boolean wifi, boolean pantry) {

        Compartment newCompartment = new Compartment(name, wifi, pantry);

        if (head == null) {
            head = tail = newCompartment;
            return;
        }

        tail.next = newCompartment;
        newCompartment.prev = tail;
        tail = newCompartment;
    }

    // Delete compartment by name
    public void deleteCompartment(String name) {

        if (head == null) {
            System.out.println("Train has no compartments.");
            return;
        }

        Compartment temp = head;

        while (temp != null) {

            if (temp.compartmentName.equals(name)) {

                // Deleting head
                if (temp == head) {
                    head = temp.next;
                    if (head != null) {
                        head.prev = null;
                    }
                }
                // Deleting tail
                else if (temp == tail) {
                    tail = temp.prev;
                    tail.next = null;
                }
                // Deleting middle compartment
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Compartment " + name + " removed.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Compartment not found.");
    }

    // Display adjacent compartments
    public void showAdjacent(String name) {

        Compartment temp = head;

        while (temp != null) {

            if (temp.compartmentName.equals(name)) {

                if (temp.prev != null) {
                    System.out.println("Previous: " + temp.prev.compartmentName);
                } else {
                    System.out.println("Previous: None");
                }

                if (temp.next != null) {
                    System.out.println("Next: " + temp.next.compartmentName);
                } else {
                    System.out.println("Next: None");
                }
                return;
            }
            temp = temp.next;
        }

        System.out.println("Compartment not found.");
    }

    // Forward traversal
    public void traverseForward() {
        Compartment temp = head;

        while (temp != null) {
            System.out.println(temp.compartmentName +
                    " | Wifi: " + temp.wifi +
                    " | Pantry: " + temp.pantry);
            temp = temp.next;
        }
    }

    // Backward traversal
    public void traverseBackward() {
        Compartment temp = tail;

        while (temp != null) {
            System.out.println(temp.compartmentName +
                    " | Wifi: " + temp.wifi +
                    " | Pantry: " + temp.pantry);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Train train = new Train();

        System.out.print("Enter number of compartments to add: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Compartment " + (i + 1));

            System.out.print("Compartment Name: ");
            String name = sc.nextLine();

            System.out.print("Is it has wifi? (true/false): ");
            boolean iswifi = sc.nextBoolean();

            System.out.print("Is it has pantry? (true/false): ");
            boolean ispantyr = sc.nextBoolean();
            sc.nextLine(); // consume newline

            train.addCompartment(name, iswifi, ispantyr);
        }

        System.out.println("\n--- Forward Traversal ---");
        train.traverseForward();

        System.out.print("\nEnter compartment name to view adjacent compartments: ");
        String adjName = sc.nextLine();
        train.showAdjacent(adjName);

        System.out.print("\nEnter compartment name to delete: ");
        String deleteName = sc.nextLine();
        train.deleteCompartment(deleteName);

        System.out.println("\n--- Backward Traversal ---");
        train.traverseBackward();

        sc.close();
    }
}
