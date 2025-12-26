import java.util.Scanner;

/*
 * Two Sum Program
 * ----------------
 * This program finds two indices in an array such that
 * the sum of the elements at those indices is equal to a given target.
 */

class TwoSum {

    /*
     * twoSum method
     * Takes an integer array and a target value
     * Returns indices of two numbers whose sum equals target
     */
    public int[] twoSum(int[] nums, int target) {

        // Loop through array elements
        for (int i = 0; i < nums.length; i++) {

            // Check with next elements
            for (int j = i + 1; j < nums.length; j++) {

                // If required sum is found
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        // If no solution found
        return new int[] {};
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Two Sum Program");

        // Taking array size input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Taking array elements input
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Taking target value input
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        // Creating object of TwoSum class
        TwoSum obj = new TwoSum();

        // Calling twoSum method
        int[] result = obj.twoSum(nums, target);

        // Displaying result
        if (result.length == 2) {
            System.out.println("Indices found at: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers found with the given target.");
        }

        sc.close();
    }
}
