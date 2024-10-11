class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ReverseLinkedList {
    
    Node head; 

    public void reverse() {
        if (head == null) {
            // Case 1: The list is empty
            System.out.println("List is empty.");
            return;
        }

        Node prev = null; // Initially, prev is null
        Node current = head; // Start from the head
        Node next = null; // Temporary pointer to store the next node

        // Traverse the list and reverse the pointers
        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the current node's pointer
            prev = current; // Move prev one step forward
            current = next; // Move current one step forward
        }

        head = prev; // After the loop, prev will be the new head of the reversed list
    }

    // Function to add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Function to print the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);

        System.out.println("Original list:");
        list.printList();

        // Reverse the list
        list.reverse();

        System.out.println("Reversed list:");
        list.printList();
    }
}
