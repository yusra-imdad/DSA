class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class DuplicatelinkedList {
    Node head;

    public void reverse() {
        if (head == null) {
            
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
    public void addtoLast(int data) {
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
        DuplicatelinkedList list = new DuplicatelinkedList();
        list.addtoLast(50);
        list.addtoLast(40);
        list.addtoLast(30);
        list.addtoLast(20);
        list.addtoLast(10);

        System.out.println("Original list:");
        list.printList();

        list.reverse();

        System.out.println("Reversed list:");
        list.printList();
    }
}
