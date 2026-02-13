import java.util.*;

public class Decoder{

    public static void getSeatDetails(String input, int length) {

        if (length != 10) {
            System.out.println("Invalid Input");
            return;
        }

        String countstr = input.substring(5, 7);

        if (!countstr.matches("\\d{2}")) {
            System.out.println("Invalid Count");
            return;
        }

        int seatCount = Integer.parseInt(countstr);

        if (seatCount < 1 || seatCount > 10) {
            System.out.println("Invalid Count");
            return;
        }

        char coach = input.charAt(7);
        String seatNumberStr = input.substring(8, 10);

        if (!Character.isLetter(coach) || !seatNumberStr.matches("\\d{2}")) {
            System.out.println("Invalid Seat Number");
            return;
        }

        int startingSeat = Integer.parseInt(seatNumberStr);

        for (int i = 0; i < seatCount; i++) {
            System.out.println(coach + String.format("%02d", startingSeat + i));
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ticket number");
        String input = sc.nextLine();
        int n = input.length();
        getSeatDetails(input, n);
        sc.close();
    }
}
