import java.util.*;

public class NumbersSum {

    public static void calculateSum() {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            double user = sc.nextDouble();

            if (user <= 0) {
                break;
            }

            total += user;
        }

        System.out.println("Total sum = " + total);
    }

    public static void main(String[] args) {
        calculateSum();
    }
}