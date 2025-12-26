import java.util.Scanner;

/*
 * Remove Element from Array
 * -------------------------
 * This program removes all occurrences of a given value from an array.
 * The array is modified in-place and the count of remaining elements
 * is returned.
 */

class RemoveElement {

    /*
     * removeElement method
     * nums[] : input integer array
     * val    : element to be removed
     * returns: number of elements after removal
     */
    public int removeElement(int[] nums, int val) {

        int count = 0; // Tracks position for elements not equal to val

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {

            // If current element is not equal to val
            if (nums[i] != val) {

                // Place the element at the current count index
                nums[count] = nums[i];
                count++;
            }
        }

        // Return count of elements after removal
        return count;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Remove Element from Array");

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input value to remove
        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();

        // Create object of Solution class
        Solution obj = new Solution();

        // Call removeElement method
        int newLength = obj.removeElement(nums, val);

        // Display result
        System.out.println("Number of elements after removal: " + newLength);
        System.out.print("Array after removing the element: ");

        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
