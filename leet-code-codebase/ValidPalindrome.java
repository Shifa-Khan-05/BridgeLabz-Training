import java.util.Scanner;

/*
 * Valid Palindrome Program
 * ------------------------
 * This program checks whether a given string is a palindrome.
 * It ignores spaces, punctuation, and case differences.
 */

class ValidPalindrome {

    /*
     * isPalindrome method
     * s : input string
     * returns : true if palindrome, false otherwise
     */
    public boolean isPalindrome(String s) {

        // StringBuilder to store filtered characters
        StringBuilder cleanString = new StringBuilder();

        // Remove non-alphanumeric characters and convert to lowercase
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleanString.append(Character.toLowerCase(ch));
            }
        }

        int left = 0;
        int right = cleanString.length() - 1;

        // Two-pointer technique to check palindrome
        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Valid Palindrome Checker");

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create object of Solution class
        Solution obj = new Solution();

        // Call isPalindrome method
        boolean result = obj.isPalindrome(input);

        // Display result
        if (result) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }

        sc.close();
    }
}
