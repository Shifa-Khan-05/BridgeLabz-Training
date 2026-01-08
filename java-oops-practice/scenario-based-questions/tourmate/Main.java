import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---- Trip Type ----
        System.out.print("Enter Trip Type (1-Domestic, 2-International): ");
        int type = sc.nextInt();
        sc.nextLine(); // consume newline

        // ---- Trip Details ----
        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter Trip Duration (days): ");
        int duration = sc.nextInt();

        // ---- Cost Inputs ----
        System.out.print("Enter Transport Cost: ");
        double transportCost = sc.nextDouble();

        System.out.print("Enter Hotel Cost: ");
        double hotelCost = sc.nextDouble();

        System.out.print("Enter Activity Cost: ");
        double activityCost = sc.nextDouble();

        Transport transport = new Transport(transportCost);
        Hotel hotel = new Hotel(hotelCost);
        Activity activity = new Activity(activityCost);

        Trip trip;

        // ---- Polymorphic Object Creation ----
        if (type == 1) {
            trip = new DomesticTrip(destination, duration, transport, hotel, activity);
        } else {
            trip = new InternationalTrip(destination, duration, transport, hotel, activity);
        }

        // ---- Booking ----
        trip.book();
        System.out.println("Total Trip Budget: ₹" + trip.getBudget());
        trip.cancel();

        sc.close();
    }
}
