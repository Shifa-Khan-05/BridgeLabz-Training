import java.util.Scanner;

/*
 * Length of Last Word
 * -------------------
 * This program finds the length of the last word in a given string.
 * Extra spaces before or after the string are ignored.
 */

class LengthOfLastWord {

    /*
     * lengthOfLastWord method
     * s : input string
     * returns : length of the last word
     */
    public int lengthOfLastWord(String s) {

        // Remove leading and trailing spaces
        String s1 = s.trim();

        // Split string into words using space as delimiter
        String[] parts = s1.split("\\s+");

        // Get length of the last word
        int ans = parts[parts.length - 1].length();

        return ans;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Length of Last Word Program");

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create object of Solution class
        Solution obj = new Solution();

        // Call lengthOfLastWord method
        int result = obj.lengthOfLastWord(input);

        // Display result
        System.out.println("Length of the last word: " + result);

        sc.close();
    }
}
