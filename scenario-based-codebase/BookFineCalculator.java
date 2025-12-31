package collegeQuestions;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*
15. Rohan’s Library Reminder App 📚
- Input due date and return date
- Fine = ₹5 per late day
- Repeat for 5 books using for-loop
*/

public class BookFineCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Loop for 5 books
        for (int i = 1; i <= 5; i++) {

            System.out.println("\nBook " + i);

            // Taking due date
            System.out.println("Enter Due Date (YYYY-MM-DD):");
            String dueDateInput = sc.next();

            // Taking return date
            System.out.println("Enter Return Date (YYYY-MM-DD):");
            String returnDateInput = sc.next();

            // Convert input string to LocalDate
            LocalDate dueDate = LocalDate.parse(dueDateInput);
            LocalDate returnDate = LocalDate.parse(returnDateInput);

            // Check if book is returned late
            if (returnDate.isAfter(dueDate)) {

                // Calculate late days
                long lateDays = ChronoUnit.DAYS.between(dueDate, returnDate);

                // Calculate fine
                long fine = lateDays * 5;

                System.out.println("Book returned late by " + lateDays + " days");
                System.out.println("Fine to be paid: ₹" + fine);
            }
            else {
                System.out.println("Book returned on time");
                System.out.println("No fine to be paid");
            }
        }

        System.out.println("\nAll books processed. Thank you.");
    }
}