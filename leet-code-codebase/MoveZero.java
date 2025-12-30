import java.util.*;

class MoveZero {

    // Method to move all zeroes to the end of the array
    // while maintaining the order of non-zero elements
    public void moveZeroes(int[] nums) {

        int i = 0; // Pointer to traverse the array
        int j = 0; // Pointer to place non-zero elements

        // First pass: copy all non-zero elements to the front
        while (i < nums.length) {
            if (nums[i] != 0) {
                nums[j] = nums[i]; // Place non-zero element at index j
                j++;               // Move j forward
            }
            i++; // Move i forward
        }

        // Second pass: fill remaining positions with zeroes
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }

        // Print the updated array
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
    }

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Create object of Solution class
        Solution obj = new Solution();

        // Input array
        int[] nums = {0, 1, 0, 3, 12};

        // Call method to move zeroes
        obj.moveZeroes(nums);
    }
}
