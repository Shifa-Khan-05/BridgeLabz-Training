import java.time.LocalDate;
import java.util.*;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookCabMain bookCabMain = new BookCabMain();

        System.out.println("Enter number of bookings to be added");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the Booking details (Booking Id:Date of Booking)");

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(":");

            String bookingId = parts[0];
            LocalDate date = LocalDate.parse(parts[1]);

            bookCabMain.addBookings(bookingId, date);
        }

        System.out.println("Enter the date to check the booking");
        String dateInput = sc.nextLine();   // Step 1: Read as String
		LocalDate searchDate = LocalDate.parse(dateInput);  // Step 2: Convert


        List<String> result = bookCabMain
                .findCabBookingIdsForTheBookingDate(searchDate);

        if (result.isEmpty()) {
            System.out.println("No bookings were booked");
        } else {
            System.out.println("Booking Ids booked on the " 
                    + searchDate + " are by");
            for (String id : result) {
                System.out.println(id);
            }
        }

        sc.close();
    }
}
