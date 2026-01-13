import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter user name: ");
        String username = sc.nextLine();
        User user = new User(username);

        System.out.println("\nChoose Game Type:");
        System.out.println("1. Arcade Game");
        System.out.println("2. Strategy Game");
        int choice = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter game title: ");
        String title = sc.nextLine();

        System.out.print("Enter price (0 for free): ");
        double price = sc.nextDouble();

        System.out.print("Enter rating: ");
        double rating = sc.nextDouble();

        Game game;

        if (choice == 1) {
            game = new ArcadeGame(title, price, rating);
        } else {
            game = new StrategyGame(title, price, rating);
        }

        System.out.print("Enter seasonal discount (%): ");
        double discount = sc.nextDouble();
        game.applySeasonalOffer(discount);   // Operator usage

        int option;
        do {
            System.out.println("\n--- GameBox Menu ---");
            System.out.println("1. Download Game");
            System.out.println("2. Play Demo");
            System.out.println("3. Show Game Details");
            System.out.println("4. Add to My Games");
            System.out.println("5. View My Games");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    game.download();
                    break;
                case 2:
                    game.playDemo();   // Polymorphism
                    break;
                case 3:
                    game.showDetails();
                    break;
                case 4:
                    user.addGame(game);
                    break;
                case 5:
                    user.showOwnedGames();
                    break;
                case 6:
                    System.out.println("Exiting GameBox...");
                    break;
                default:
                    System.out.println("Invalid option");
            }

        } while (option != 6);

        sc.close();
    }
}
