
import java.util.*;
public class ArtifyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter user name: ");
        String name = sc.nextLine();

        System.out.print("Enter wallet balance: ");
        double balance = sc.nextDouble();
        sc.nextLine(); // consume newline

        User user = new User(name, balance);

        // Artwork input
        System.out.print("Enter artwork title: ");
        String title = sc.nextLine();

        System.out.print("Enter artist name: ");
        String artist = sc.nextLine();

        System.out.print("Enter license type: ");
        String license = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.println("Choose artwork type:");
        System.out.println("1. Digital Art");
        System.out.println("2. Print Art");
        int choice = sc.nextInt();

        Artwork art;

        // Polymorphism based on user choice
        if (choice == 1) {
            art = new DigitalArt(title, artist, license, price);
        } else {
            art = new PrintArt(title, artist, license, price);
        }

        // Perform operations
        art.purchase(user);
        art.license();

        System.out.println("Remaining Wallet Balance: " + user.getBalance());

        sc.close();
    }
}
