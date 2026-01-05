import java.util.Scanner;

public class SwiftCart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Product " + (i + 1) + " Details");

            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Category: ");
            sc.nextLine();
            String category = sc.nextLine();

            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            System.out.print("Product Type (1-Perishable, 2-NonPerishable): ");
            int type = sc.nextInt();
            sc.nextLine();

            Product p;

            if (type == 1)
                p = new PerishableProduct(name, price, category, qty);
            else
                p = new NonPerishableProduct(name, price, category, qty);

            cart.addProduct(p);
        }

        cart.generateBill();
        sc.close();
    }
}
