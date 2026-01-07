import java.util.Scanner;

public class BookBazaarApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- User Details --------
        System.out.print("Enter User Name: ");
        String userName = sc.nextLine();

        Order order = new Order(userName);

        // -------- Book Creation --------
        System.out.print("\nHow many books do you want to order? ");
        int bookCount = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 1; i <= bookCount; i++) {

            System.out.println("\nBook " + i + " Details:");

            System.out.print("Enter Book Type (1-EBook, 2-PrintedBook): ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Author: ");
            String author = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Stock: ");
            int stock = sc.nextInt();

            System.out.print("Enter Quantity to Order: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Book book;

            // -------- Polymorphism --------
            if (type == 1) {
                book = new EBook(title, author, price, stock);
            } else {
                book = new PrintedBook(title, author, price, stock);
            }

            order.addBook(book, quantity);
        }

        // -------- Order Summary --------
        System.out.println("\n Order Status: " + order.getStatus());
        System.out.printf(" Total Amount: ₹%.2f%n", order.calculateTotal());

        sc.close();
    }
}
