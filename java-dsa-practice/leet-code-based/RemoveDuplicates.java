class RemoveDuplicates {

    /**
     * Removes all nodes from the linked list whose value equals 'val'
     *
     * @param head Head of the linked list
     * @param val  Value to be removed
     * @return Updated head of the linked list
     */
    public ListNode removeElements(ListNode head, int val) {

        // Dummy node to handle edge cases (like removing the head node)
        ListNode temp = new ListNode(0);
        temp.next = head;

        // Pointer to traverse the list
        ListNode current = temp;

        // Traverse until the end of the list
        while (current.next != null) {

            // If next node contains the value to be removed
            if (current.next.val == val) {
                // Skip the node by changing the reference
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        // Return the updated head of the list
        return temp.next;
    }

    // Main method for testing
    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1,
                            new ListNode(2,
                            new ListNode(6,
                            new ListNode(3,
                            new ListNode(4,
                            new ListNode(5,
                            new ListNode(6)))))));

        int val = 6; // Value to be removed

        Solution solution = new Solution();
        ListNode result = solution.removeElements(head, val);

        // Printing the updated linked list
        System.out.print("Updated Linked List: ");
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }
}
