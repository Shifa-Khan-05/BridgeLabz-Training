import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---- Bag Input (One Time) ----
        System.out.print("Enter Bag ID: ");
        String bagId = sc.nextLine();

        System.out.print("Enter Bag Color: ");
        String bagColor = sc.nextLine();

        System.out.print("Enter Bag Capacity: ");
        int capacity = sc.nextInt();
        sc.nextLine(); // consume newline

        Bag bag = new Bag(bagId, bagColor, capacity);

        int choice;

        do {
            System.out.println("\n====== BAG MENU ======");
            System.out.println("1. Add Ball");
            System.out.println("2. Remove Ball");
            System.out.println("3. Display All Balls");
            System.out.println("4. Display Bag Summary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Ball ID: ");
                    String ballId = sc.nextLine();

                    System.out.print("Enter Ball Color: ");
                    String ballColor = sc.nextLine();

                    System.out.print("Enter Ball Size (Small/Medium/Large): ");
                    String ballSize = sc.nextLine();

                    Ball ball = new Ball(ballId, ballColor, ballSize);
                    bag.addBall(ball);
                    break;

                case 2:
                    System.out.print("Enter Ball ID to remove: ");
                    String removeId = sc.nextLine();
                    bag.removeBall(removeId);
                    break;

                case 3:
                    System.out.println("\n--- Balls in Bag ---");
                    bag.displayBalls();
                    break;

                case 4:
                    System.out.println("\n--- Bag Summary ---");
                    bag.displayBagInfo();
                    break;

                case 5:
                    System.out.println("Exiting program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
