package com.trafficmanager;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class TrafficManager {

    private Vehicle tail;                    
    private int roundaboutCapacity = 3;
    private int currentCount = 0;

    private Queue<String> waitingQueue = new LinkedList<>();
    private int waitingQueueCapacity = 5;

    // Add vehicle to roundabout or queue
    public void addVehicle(String vehicleNo) {

        if (currentCount < roundaboutCapacity) {
            addToRoundabout(vehicleNo);
        } else {
            if (waitingQueue.size() < waitingQueueCapacity) {
                waitingQueue.add(vehicleNo);
                System.out.println("Roundabout full. Vehicle " + vehicleNo + " added to waiting queue.");
            } else {
                System.out.println("Waiting queue overflow! Vehicle " + vehicleNo + " cannot enter.");
            }
        }
    }

    // Add to circular linked list
    private void addToRoundabout(String vehicleNo) {

        Vehicle newVehicle = new Vehicle(vehicleNo);

        if (tail == null) {
            tail = newVehicle;
            tail.next = tail; // circular link
        } else {
            newVehicle.next = tail.next;
            tail.next = newVehicle;
            tail = newVehicle;
        }

        currentCount++;
        System.out.println("Vehicle " + vehicleNo + " entered the roundabout.");
    }

    // Remove vehicle from roundabout
    public void removeVehicle() {

        if (tail == null) {
            System.out.println("Roundabout is empty. No vehicle to remove.");
            return;
        }

        Vehicle head = tail.next;

        if (head == tail) {
            System.out.println("Vehicle " + head.number + " exited the roundabout.");
            tail = null;
        } else {
            System.out.println("Vehicle " + head.number + " exited the roundabout.");
            tail.next = head.next;
        }

        currentCount--;

        // Check waiting queue
        if (!waitingQueue.isEmpty()) {
            String nextVehicle = waitingQueue.poll();
            addToRoundabout(nextVehicle);
        } else {
            System.out.println("Waiting queue underflow. No vehicles waiting.");
        }
    }

    // Print current state of roundabout
    public void printRoundabout() {

        if (tail == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        Vehicle temp = tail.next;
        System.out.println("Current vehicles in roundabout:");

        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println("(back to start)");
    }

    // Print waiting queue
    public void printWaitingQueue() {
        System.out.println("Waiting Queue: " + waitingQueue);
    }

    public static void main(String[] args) {


        TrafficManager manager = new TrafficManager();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== TRAFFIC MANAGER MENU =====");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. View Roundabout");
            System.out.println("4. View Waiting Queue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter vehicle number: ");
                    String vehicleNo = sc.nextLine();
                    manager.addVehicle(vehicleNo);
                    break;

                case 2:
                    manager.removeVehicle();
                    break;

                case 3:
                    manager.printRoundabout();
                    break;

                case 4:
                    manager.printWaitingQueue();
                    break;

                case 5:
                    System.out.println("Exiting Traffic Manager...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
