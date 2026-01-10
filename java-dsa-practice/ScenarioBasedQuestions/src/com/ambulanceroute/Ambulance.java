package com.ambulanceroute;

public class Ambulance {

    // Head of the circular linked list
    UnitNode head;

    // Method to add a hospital unit to the circular linked list
    public void addUnit(String unitName, boolean available) {

        UnitNode newNode = new UnitNode(unitName, available);

        // Case 1: If list is empty
        if (head == null) {
            head = newNode;
            newNode.next = head; // Point to itself to make it circular
            return;
        }

        // Case 2: Insert at the end of the circular list
        UnitNode temp = head;

        // Traverse till the last node (whose next points to head)
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Method to find the first available unit
    public void findAvailableUnit() {

        if (head == null) {
            System.out.println("No units available.");
            return;
        }

        UnitNode current = head;

        // Traverse circularly until we come back to head
        do {
            if (current.available) {
                System.out.println("Available unit found: " + current.unitName);
                return;
            }
            current = current.next;
        } while (current != head);

        // If no available unit is found
        System.out.println("No available unit found.");
    }

    // Method to remove a unit under maintenance
    public void removeUnit(String unitName) {

        if (head == null) {
            System.out.println("No units to remove.");
            return;
        }

        UnitNode current = head;
        UnitNode prev = null;

        do {
            if (current.unitName.equals(unitName)) {

                // Case 1: Only one node in the list
                if (current == head && current.next == head) {
                    head = null;
                    System.out.println("Unit removed: " + unitName);
                    return;
                }

                // Case 2: Removing head node
                if (current == head) {
                    UnitNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                // Case 3: Removing middle or last node
                else {
                    prev.next = current.next;
                }

                System.out.println("Unit removed: " + unitName);
                return;
            }

            prev = current;
            current = current.next;

        } while (current != head);

        System.out.println("Unit not found: " + unitName);
    }

    // Method to display hospital route
    public void displayRoute() {

        if (head == null) {
            System.out.println("No hospital units available.");
            return;
        }

        UnitNode temp = head;
        System.out.print("Hospital Route: ");

        do {
            System.out.print(temp.unitName + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to start)");
    }
}
