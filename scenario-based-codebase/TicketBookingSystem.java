

import java.util.Scanner;

/**12.
 * Train Ticket Booking System
 * ----------------------------
 * This program provides a menu-driven train ticket booking system.
 * Users can:
 *  - Book tickets based on seat type
 *  - Cancel booked tickets
 *  - Check ticket status
 *  - View fare details
 *  - Check available seats
 */
class TicketBookingSystem {

    // Static variables to store seat availability (shared across the program)
    static int sleeperSeats = 100;
    static int secondSeatingSeats = 70;
    static int acSeats = 30;

    /**
     * Displays the main menu and handles user choices
     */
    public static void ticketChecker() {

        Scanner scanner = new Scanner(System.in);
        int choice;

        // Menu keeps running until user chooses Exit
        do {
            System.out.println("\n=================================");
            System.out.println("         Train Ticket Booking");
            System.out.println("=================================");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Check Ticket Status");
            System.out.println("4. Fare Enquiry");
            System.out.println("5. Seats Available");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            // Read user choice
            choice = scanner.nextInt();

            // Perform action based on user choice
            switch (choice) {

                case 1:
                    bookTicket();
                    break;

                case 2:
                    cancelTicket();
                    break;

                case 3:
                    System.out.println("\n Ticket Status: CONFIRMED");
                    break;

                case 4:
                    fareEnquiry();
                    break;

                case 5:
                    displaySeats();
                    break;

                case 6:
                    System.out.println("\n Thank you for using Train Ticket Booking System!");
                    break;

                default:
                    System.out.println("\n Invalid choice! Please try again.");
            }

        } while (choice != 6); // Loop exits when user selects Exit

        // Close scanner resource
        scanner.close();
    }

    /**
     * Books a ticket based on seat type selected by the user
     */
    public static void bookTicket() {
         Scanner scanner = new Scanner(System.in);
        System.out.println("\nSelect Seat Type:");
        System.out.println("1. Sleeper");
        System.out.println("2. Second Seating");
        System.out.println("3. AC");
        System.out.print("Enter your choice: ");

        int seatChoice = scanner.nextInt();

        // Book ticket according to seat type availability
        switch (seatChoice) {

            case 1:
                if (sleeperSeats > 0) {
                    sleeperSeats--;
                    System.out.println(" Sleeper ticket booked successfully!");
                } else {
                    System.out.println(" Sleeper seats not available!");
                }
                break;

            case 2:
                if (secondSeatingSeats > 0) {
                    secondSeatingSeats--;
                    System.out.println(" Second Seating ticket booked successfully!");
                } else {
                    System.out.println(" Second Seating seats not available!");
                }
                break;

            case 3:
                if (acSeats > 0) {
                    acSeats--;
                    System.out.println(" AC ticket booked successfully!");
                } else {
                    System.out.println(" AC seats not available!");
                }
                break;

            default:
                System.out.println(" Invalid seat choice!");
        }
    }

    /**
     * Cancels a ticket based on seat type selected by the user
     */
    public static void cancelTicket() {
       
	      Scanner scanner = new Scanner(System.in);
        System.out.println("\nSelect Seat Type to Cancel:");
        System.out.println("1. Sleeper");
        System.out.println("2. Second Seating");
        System.out.println("3. AC");
        System.out.print("Enter your choice: ");

        int seatChoice = scanner.nextInt();

        // Increase seat count after cancellation
        switch (seatChoice) {

            case 1:
                sleeperSeats++;
                System.out.println(" Sleeper ticket cancelled successfully!");
                break;

            case 2:
                secondSeatingSeats++;
                System.out.println(" Second Seating ticket cancelled successfully!");
                break;

            case 3:
                acSeats++;
                System.out.println(" AC ticket cancelled successfully!");
                break;

            default:
                System.out.println(" Invalid seat choice!");
        }
    }

    /**
     * Displays fare details for each seat type
     */
    public static void fareEnquiry() {

        System.out.println("\n Fare Details:");
        System.out.println("Sleeper        : ₹300");
        System.out.println("Second Seating : ₹200");
        System.out.println("AC             : ₹600");
    }

    /**
     * Displays the number of available seats for each category
     */
    public static void displaySeats() {

        System.out.println("\n Seat Availability:");
        System.out.println("Sleeper Seats        : " + sleeperSeats);
        System.out.println("Second Seating Seats : " + secondSeatingSeats);
        System.out.println("AC Seats             : " + acSeats);
    }

    /**
     * Program execution starts from main method
     */
    public static void main(String[] args) {
        ticketChecker();
    }
}
