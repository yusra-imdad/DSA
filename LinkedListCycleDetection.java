class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCycleDetection {

    // Method to detect if the linked list contains a cycle
    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false; // If the list is empty or has only one node, no cycle
        }

        Node slow = head; // Tortoise moves one step at a time
        Node fast = head; // Hare moves two steps at a time

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer one step
            fast = fast.next.next; // Move fast pointer two steps

            // If slow and fast meet, there's a cycle
            if (slow == fast) {
                return true;
            }
        }

        return false; // If no cycle is found
    }

    public static void main(String[] args) {
        // Create a linked list with a cycle for testing
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.next = third;
        third.next = second; // Creates a cycle by pointing back to 'second'

        // Check if the linked list has a cycle
        if (hasCycle(head)) {
            System.out.println("The linked list contains a cycle.");
        } else {
            System.out.println("No cycle in the linked list.");
        }

        // Test with a list that doesn't have a cycle
        third.next = null; // Breaking the cycle

        if (hasCycle(head)) {
            System.out.println("The linked list contains a cycle.");
        } else {
            System.out.println("No cycle in the linked list.");
        }
    }
}
