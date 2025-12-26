import java.util.Scanner;

/*
 * Remove Duplicates from Sorted Array
 * -----------------------------------
 * This program removes duplicate elements from a sorted array.
 * It modifies the array in-place and returns the count of
 * unique elements.
 */

class RemoveDuplicateFromArray {

    /*
     * removeDuplicates method
     * nums[] : sorted integer array
     * returns : count of unique elements
     */
    public int removeDuplicates(int[] nums) {

        // If array is empty, return 0
        if (nums.length == 0) {
            return 0;
        }

        int count = 1; // First element is always unique

        // Loop starts from second element
        for (int i = 1; i < nums.length; i++) {

            // If current element is not equal to previous
            if (nums[i] != nums[i - 1]) {

                // Place unique element at correct position
                nums[count] = nums[i];
                count++;
            }
        }

        // Return number of unique elements
        return count;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Remove Duplicates from Sorted Array");

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input sorted array elements
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create object of Solution class
        Solution obj = new Solution();

        // Call removeDuplicates method
        int uniqueCount = obj.removeDuplicates(nums);

        // Display result
        System.out.println("Number of unique elements: " + uniqueCount);
        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
