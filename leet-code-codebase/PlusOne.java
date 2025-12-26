import java.util.Scanner;

/*
 * Plus One Program
 * ----------------
 * This program adds one to a number represented as an array of digits.
 * Example:
 * Input  : [1, 2, 9]
 * Output : [1, 3, 0]
 */

class PlusOne {

    /*
     * plusOne method
     * digits[] : array representing a number
     * returns  : array after adding one
     */
    public int[] plusOne(int[] digits) {

        // Traverse array from last digit to first
        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is 9, set it to 0 and continue carry
            if (digits[i] == 9) {
                digits[i] = 0;
            } 
            // If digit is not 9, add 1 and return result
            else {
                digits[i]++;
                return digits;
            }
        }

        // If all digits were 9 (example: 999 → 1000)
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        return newDigits;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Plus One Program");

        // Input size of array
        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();

        int[] digits = new int[n];

        // Input digit
