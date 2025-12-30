import java.util.Arrays;

class SingleNumber {

    // Method to find the single number
    // Every element appears twice except one
    public int singleNumber(int[] nums) {

        // Sort the array so duplicate numbers come next to each other
        Arrays.sort(nums);

        // If array has only one element, return it
        if (nums.length == 1) {
            return nums[0];
        }

        // Traverse the array in steps of 2
        for (int i = 0; i < nums.length - 1; i += 2) {

            // If the current element is not equal to the next one,
            // then current element is the single number
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        // If no mismatch found, the last element is the single number
        return nums[nums.length - 1];
    }

    // Main method to test the program
    public static void main(String[] args) {

        Solution obj = new Solution();

        // Test input
        int[] nums = {4, 1, 2, 1, 2};

        // Call method and print result
        int result = obj.singleNumber(nums);
        System.out.println("Single Number: " + result);
    }
}
