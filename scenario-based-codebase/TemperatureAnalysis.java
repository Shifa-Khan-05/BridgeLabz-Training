import java.util.Scanner;
/**11.
     *  Average Temperature Analyzer
     * --------------------------------
     * - Accepts temperature input for 7 days
     * - Calculates the average temperature
     * - Finds the maximum temperature
     */
public class TemperatureAnalysis {

    
    public void averageTemperature() {

        Scanner scanner = new Scanner(System.in);

        final int DAYS = 7;                 // Constant for number of days
        int[] temperatures = new int[DAYS];

        int sum = 0;
        int maxTemperature = Integer.MIN_VALUE;

        System.out.println("=================================");
        System.out.println("    Weekly Temperature Input");
        System.out.println("=================================");
        System.out.println("Please enter temperature for 7 days:");

        // Reading temperatures
        for (int i = 0; i < DAYS; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextInt();

            sum += temperatures[i];

            // Find maximum temperature
            if (temperatures[i] > maxTemperature) {
                maxTemperature = temperatures[i];
            }
        }

        // Calculate average temperature
        double averageTemperature = (double) sum / DAYS;

        // Display results
        System.out.println("\n=================================");
        System.out.println("        Temperature Report");
        System.out.println("=================================");
        System.out.printf("Average Temperature : %.2fdegC%n", averageTemperature);
        System.out.println("Maximum Temperature : " + maxTemperature + "degC");
        System.out.println("=================================");

        scanner.close();
    }

    public static void main(String[] args) {

        System.out.println("\nWelcome to Temperature Analysis Program \n");

        TemperatureAnalysis analysis = new TemperatureAnalysis();
        analysis.averageTemperature();

        System.out.println("\nThank you for using the program ");
    }
}
