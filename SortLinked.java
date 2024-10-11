class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SortLinked {
    
     Node head; 

    // Function to sort the linked list by swapping nodes
    public void sort() {
        if (head == null) {
        
            System.out.println("List is empty.");
            return;
        }

        boolean swapped;
        Node current;
        Node prev = null;

        do {
            swapped = false;
            current = head;

            while (current.next != null) {
                if (current.data > current.next.data) {
                    // Swap the nodes (not the data)
                    swapNodes(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped); // Repeat the process until no swaps occur (list is sorted)
    }

    private void swapNodes(Node node1, Node node2) {
        int temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;
    }

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
        SortLinked list = new SortLinked();
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);

        System.out.println("Original list:");
        list.printList();

        
        list.sort();

        System.out.println("Sorted list:");
        list.printList();
    }
}
