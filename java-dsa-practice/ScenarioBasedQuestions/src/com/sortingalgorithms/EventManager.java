import java.util.Scanner;

public class EventManager {

    // Quick Sort method
    static void quickSort(int[] prices, int low, int high) {

        // Check if there are at least two elements to sort
        if (low < high) {

            // Get the correct position of pivot element
            int pivotIndex = partition(prices, low, high);

            // Recursively sort elements before pivot
            quickSort(prices, low, pivotIndex - 1);

            // Recursively sort elements after pivot
            quickSort(prices, pivotIndex + 1, high);
        }
    }


    
    // Partition method to place pivot in correct position
    static int partition(int[] prices, int low, int high) {

        // Choose last element as pivot
        int pivot = prices[high];

        // Index of smaller element
        int i = low - 1;

        // Compare each element with pivot
        for (int j = low; j < high; j++) {

            // If current element is smaller than pivot
            if (prices[j] < pivot) {
                i++;

                // Swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Place pivot at its correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        // Return pivot index
        return i + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for number of tickets
        System.out.print("Enter number of tickets: ");
        int n = sc.nextInt();

        int[] ticketPrices = new int[n];

        // Take ticket prices as input
        System.out.println("Enter ticket prices:");
        for (int i = 0; i < n; i++) {
            ticketPrices[i] = sc.nextInt();
        }

        // Apply Quick Sort
        quickSort(ticketPrices, 0, n - 1);

        // Display sorted ticket prices
        System.out.println("\nSorted Ticket Prices:");
        for (int price : ticketPrices) {
            System.out.print(price + " ");
        }

        sc.close();
    }
}
