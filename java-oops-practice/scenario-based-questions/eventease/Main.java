import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Organizer Details");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        User organizer = new User(name, email);

        System.out.println("\nEnter Event Details");
        System.out.print("Event Name: ");
        String eventName = sc.nextLine();

        System.out.print("Location: ");
        String location = sc.nextLine();

        System.out.print("Date (DD-MM-YYYY): ");
        String date = sc.nextLine();

        System.out.print("Number of Attendees: ");
        int attendees = sc.nextInt();

        System.out.print("Catering Required? (true/false): ");
        boolean catering = sc.nextBoolean();

        System.out.print("Decoration Required? (true/false): ");
        boolean decoration = sc.nextBoolean();

        System.out.println("\nSelect Event Type");
        System.out.println("1. Birthday Event");
        System.out.println("2. Conference Event");
        System.out.print("Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        Event event;

        if (choice == 1)
            event = new BirthdayEvent(eventName, location, date, attendees, catering, decoration, organizer);
        else
            event = new ConferenceEvent(eventName, location, date, attendees, catering, decoration, organizer);

        System.out.println("\n1. Schedule Event");
        System.out.println("2. Reschedule Event");
        System.out.println("3. Cancel Event");
        System.out.print("Action: ");
        int action = sc.nextInt();
        sc.nextLine();

        if (action == 1)
            event.schedule();
        else if (action == 2) {
            System.out.print("Enter New Date: ");
            String newDate = sc.nextLine();
            event.reschedule(newDate);
        } else
            event.cancel();

        System.out.println("\n--- Event Details ---");
        event.showEventDetails();

        sc.close();
    }
}
