import java.util.*;

// Program to calculate Euclidean distance and equation of a line
public class LineAndDistance {

    // Method to calculate Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {

        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );

        return distance;
    }

    // Method to find slope (m) and y-intercept (b)
    // Returns array: result[0] = slope (m), result[1] = intercept (b)
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {

        double result[] = new double[2];

        double m = (y2 - y1) / (x2 - x1);   // slope
        double b = y1 - m * x1;             // y-intercept

        result[0] = m;
        result[1] = b;

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input for first point
        System.out.println("Enter x1 and y1:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        // Taking input for second point
        System.out.println("Enter x2 and y2:");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Calculate distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance = " + distance);

        // Calculate line equation
        double line[] = calculateLineEquation(x1, y1, x2, y2);

        System.out.println("Equation of Line:");
        System.out.println("y = " + line[0] + "x + " + line[1]);

        sc.close();
    }
}
