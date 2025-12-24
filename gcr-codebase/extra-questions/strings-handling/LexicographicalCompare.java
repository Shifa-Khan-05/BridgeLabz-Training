import java.util.*;


//Write a Java program to compare two strings lexicographically (dictionary order) without
//using built-in compare methods.
public class LexicographicalCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        compareStrings(s1, s2);

        sc.close();
    }

    public static void compareStrings(String s1, String s2) {

        int minLength = Math.min(s1.length(), s2.length());

        // Compare character by character
        for (int i = 0; i < minLength; i++) {

            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 < c2) {
                System.out.println( s1 + " "+  "comes before"  + "  " + s2 + " " + "in lexicographical order");
                return;
            }
            else if (c1 > c2) {
                System.out.println( s1 + " "+ " comes after "  + s2 + " " + "in lexicographical order");
                return;
            }
        }

        // If all characters are equal till min length
        if (s1.length() < s2.length()) {
                       System.out.println( s1 + " "+  "comes before"  + "  " + s2 + " " + "in lexicographical order");

        }
        else if (s1.length() > s2.length()) {
    
                System.out.println( s1 + " "+ " comes after "  + s2 + " "  + "in lexicographical order");
	}
        else {
            System.out.println("Both strings are equal");
        }
    }
}
