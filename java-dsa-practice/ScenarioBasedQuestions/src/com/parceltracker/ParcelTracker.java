package com.parceltracker;

import java.util.Scanner;

public class ParcelTracker {

    Node head;

    // Add node at given position (0-based index)
    public void addAtPos(int pos, String status) {

        Node newNode = new Node(status);

        // Insert at beginning
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Invalid position. Stage missing.");
                return;
            }
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Forward tracking
    public void forwardTracking() {

        if (head == null) {
            System.out.println("Parcel lost or tracking data unavailable.");
            return;
        }

        Node temp = head;
        System.out.println("Parcel Tracking Status:");

        while (temp != null) {
            System.out.println("→ " + temp.status);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParcelTracker parcel = new ParcelTracker();

        // Default delivery stages
        parcel.addAtPos(0, "Packed");
        parcel.addAtPos(1, "Shipped");
        parcel.addAtPos(2, "In Transit");
        parcel.addAtPos(3, "Delivered");

        int choice;

        while (true) {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Add intermediate checkpoint");
            System.out.println("2. Forward tracking");
            System.out.println("0. Exit");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 0) {
                System.out.println("Exiting Parcel Tracker...");
                break;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter stage name: ");
                    String stage = sc.nextLine();

                    parcel.addAtPos(pos, stage);
                    break;

                case 2:
                    parcel.forwardTracking();
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
