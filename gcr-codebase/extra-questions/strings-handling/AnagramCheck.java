import java.util.*;

public class AnagramCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        if (areAnagrams(s1, s2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }

        sc.close();
    }

    public static boolean areAnagrams(String s1, String s2) {

        // Remove spaces and convert to lowercase
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // Check length
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert to char array and sort
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        // Compare sorted arrays
        return Arrays.equals(a1, a2);
    }
}
