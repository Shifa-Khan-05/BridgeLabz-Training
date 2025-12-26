import java.util.Scanner;

/*
 * strStr Program
 * --------------
 * This program finds the index of the first occurrence
 * of a substring (needle) inside another string (haystack).
 * If not found, it returns -1.
 */

class FirstOccurrence {

    /*
     * strStr method
     * haystack : main string
     * needle   : substring to search
     * returns  : index of first occurrence or -1
     */
    public int strStr(String haystack, String needle) {

        // Using built-in indexOf() method
        int ans = haystack.indexOf(needle);
        return ans;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Find Index of Substring (strStr)");

        // Input main string
        System.out.print("Enter the main string (haystack): ");
        String haystack = sc.nextLine();

        // Input substring
        System.out.print("Enter the substring (needle): ");
        String needle = sc.nextLine();

        // Create object of Solution class
        Solution obj = new Solution();

        // Call strStr method
        int result = obj.strStr(haystack, needle);

        // Display result
        if (result != -1) {
            System.out.println("Substring found at index: " + result);
        } else {
            System.out.println("Substring not found.");
        }

        sc.close();
    }
}
