class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {
    
    // Method to add two numbers represented as linked lists
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy node to build result
        ListNode current = dummyHead;
        int carry = 0;

        // Loop until both lists and carry are exhausted
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummyHead.next;
    }

    // Helper method to create a linked list from array
    public static ListNode createList(int[] digits) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int digit : digits) {
            current.next = new ListNode(digit);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to print a linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Example 1: 342 + 465 = 807 => [7,0,8]
        int[] num1 = {2, 4, 3};
        int[] num2 = {5, 6, 4};

        ListNode l1 = createList(num1);
        ListNode l2 = createList(num2);

        System.out.print("Input List 1: ");
        printList(l1);

        System.out.print("Input List 2: ");
        printList(l2);

        ListNode result = addTwoNumbers(l1, l2);

        System.out.print("Result: ");
        printList(result);
    }
}
