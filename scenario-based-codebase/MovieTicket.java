package collegeQuestions;

import java.util.Scanner;

/*
 14. Movie Ticket Booking App 🎬

 Features implemented:
 - Ask user for movie type
 - Ask user for seat type (Gold / Silver)
 - Ask user for snacks
 - Use switch + if together
 - Loop for multiple customers
 - Simple and clean structure
 */

public class MovieTicket {

    // Method to book tickets for multiple customers
    public static void bookTicket() {

        Scanner sc = new Scanner(System.in);
        boolean continueBooking = true;

        while (continueBooking) {

            // ---------- MOVIE TYPE ----------
            System.out.println("\nChoose Movie Type:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Romance");
            System.out.println("4. Documentary");

            int movieChoice = sc.nextInt();
            String movieName = "";

            switch (movieChoice) {
                case 1:
                    movieName = "Action";
                    break;
                case 2:
                    movieName = "Comedy";
                    break;
                case 3:
                    movieName = "Romance";
                    break;
                case 4:
                    movieName = "Documentary";
                    break;
                default:
                    System.out.println("Invalid movie choice");
                    continue;
            }

            // ---------- SEAT TYPE ----------
            System.out.println("\nChoose Seat Type:");
            System.out.println("1. Gold");
            System.out.println("2. Silver");

            int seatChoice = sc.nextInt();
            String seatType = "";
            int seatPrice = 0;

            if (seatChoice == 1) {
                seatType = "Gold";
                seatPrice = 250;
            } else if (seatChoice == 2) {
                seatType = "Silver";
                seatPrice = 150;
            } else {
                System.out.println("Invalid seat choice");
                continue;
            }

            // ---------- SNACKS ----------
            System.out.println("\nChoose Snacks:");
            System.out.println("1. Chips (50)");
            System.out.println("2. Cold Drink (40)");
            System.out.println("3. Popcorn (70)");
            System.out.println("4. Samosa (30)");
            System.out.println("5. Not Required");

            int snackChoice = sc.nextInt();
            String snackName = "None";
            int snackPrice = 0;

            switch (snackChoice) {
                case 1:
                    snackName = "Chips";
                    snackPrice = 50;
                    break;
                case 2:
                    snackName = "Cold Drink";
                    snackPrice = 40;
                    break;
                case 3:
                    snackName = "Popcorn";
                    snackPrice = 70;
                    break;
                case 4:
                    snackName = "Samosa";
                    snackPrice = 30;
                    break;
                case 5:
                    snackName = "No Snacks";
                    snackPrice = 0;
                    break;
                default:
                    System.out.println("Invalid snack choice");
            }

            // ---------- BILL ----------
            int totalAmount = seatPrice + snackPrice;

            System.out.println("\n------ TICKET DETAILS ------");
            System.out.println("Movie Type : " + movieName);
            System.out.println("Seat Type  : " + seatType);
            System.out.println("Snacks     : " + snackName);
            System.out.println("Total Bill : Rs. " + totalAmount);

            // ---------- CONTINUE ----------
            System.out.println("\nDo you want to book another ticket? (yes/no)");
            String choice = sc.next();

            if (!choice.equalsIgnoreCase("yes")) {
                continueBooking = false;
                System.out.println("Thank you for using Movie Ticket App");
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        System.out.println("=========== MOVIE TICKET SOFTWARE ===========");
        System.out.println("1. Book Ticket");
        System.out.println("2. Exit");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input == 1) {
            bookTicket();
        } else {
            System.out.println("Application Closed");
        }
    }
}