import java.util.ArrayList;
import java.util.List;

class IsPalindrome {

    /**
     * Checks whether a singly linked list is a palindrome.
     *
     * @param head Head of the linked list
     * @return true if the list is a palindrome, otherwise false
     */
    public boolean isPalindrome(ListNode head) {

        // Store linked list values in an ArrayList
        List<Integer> list = new ArrayList<>();

        // Traverse the linked list and copy values to the list
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        // Two-pointer approach to compare values
        int left = 0;
        int right = list.size() - 1;

        // Compare values from both ends
        while (left < right && list.get(left).equals(list.get(right))) {
            left++;
            right--;
        }

        // If pointers crossed, it is a palindrome
        return left >= right;
    }

    // Main method for testing
    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 2 -> 1
        ListNode head = new ListNode(1,
                            new ListNode(2,
                            new ListNode(2,
                            new ListNode(1))));

        IsPalindrome solution = new IsPalindrome();
        boolean result = solution.isPalindrome(head);

        // Output result
        System.out.println("Is Palindrome: " + result);
    }
}
