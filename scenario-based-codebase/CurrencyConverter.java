/*
18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).

*/	
	import java.util.*;
	
  public class CurrencyConverter
	{
       public static void currencyConverter(Scanner sc) {

        char again;

        do {
            System.out.println("\n====================================");
            System.out.println("          Currency Exchange            ");
            System.out.println("====================================");
            System.out.print("Enter amount in INR: ");
            double inr = sc.nextDouble();

            System.out.println("\nChoose currency:");
            System.out.println("1. US Dollar");
            System.out.println("2. Euro");
            System.out.println("3. British Pound");
            System.out.println("4. Australian Dollar");
            System.out.println("5. Canadian Dollar");
            System.out.println("6. Singapore Dollar");
            System.out.println("7. Swiss Franc");
            System.out.println("8. Malaysian Ringgit");
            System.out.println("9. Japanese Yen");
            System.out.println("10. Chinese Yuan");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            double result = 0;

            switch (choice) {
                case 1: result = inr * 0.011129;
                        System.out.println("INR to US Dollar = " + result);
                        break;
                case 2: result = inr * 0.009492;
                        System.out.println("INR to Euro = " + result);
                        break;
                case 3: result = inr * 0.008287;
                        System.out.println("INR to British Pound = " + result);
                        break;
                case 4: result = inr * 0.016647;
                        System.out.println("INR to Australian Dollar = " + result);
                        break;
                case 5: result = inr * 0.015252;
                        System.out.println("INR to Canadian Dollar = " + result);
                        break;
                case 6: result = inr * 0.014313;
                        System.out.println("INR to Singapore Dollar = " + result);
                        break;
                case 7: result = inr * 0.008833;
                        System.out.println("INR to Swiss Franc = " + result);
                        break;
                case 8: result = inr * 0.045180;
                        System.out.println("INR to Malaysian Ringgit = " + result);
                        break;
                case 9: result = inr * 1.742808;
                        System.out.println("INR to Japanese Yen = " + result);
                        break;
                case 10: result = inr * 0.077759;
                         System.out.println("INR to Chinese Yuan = " + result);
                         break;
                default:
                         System.out.println(" Invalid choice!");
            }

            System.out.print("\nDo you want another conversion? (y/n): ");
            again = sc.next().charAt(0);

        } while (again == 'y' || again == 'Y');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        currencyConverter(sc);
        System.out.println("\nThank you for using Currency Exchange Kiosk ");
        sc.close();
    }
}
