import java.util.*;

// Main application class
public class Main {

    public static void main(String[] args) {

        // Collection to store multiple bookings
        List<Booking> bookings = new ArrayList<>();

        // Polymorphism:
        // Parent reference holding child objects
        Room room1 = new StandardRoom(101);
        Room room2 = new DeluxeRoom(202);

        // Creating bookings
        bookings.add(new Booking("Amit", room1, 3));
        bookings.add(new Booking("Riya", room2, 7));

        // Processing all bookings
        for (Booking booking : bookings) {
            booking.showBill();
        }
    }
}
