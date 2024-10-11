class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class NthNode {

    Node head; 

    
    public int nthFromLast(int n) {
        if (head == null) {
            
            return LIST_EMPTY;
        }

        Node mainPtr = head;
        Node refPtr = head;

        // Move refPtr n steps ahead
        for (int i = 0; i < n; i++) {
            if (refPtr == null) {
                // If n is larger than the number of nodes
                return LIST_EMPTY;
            }
            refPtr = refPtr.next;
        }

        // Move both pointers until refPtr reaches the end
        while (refPtr != null) {
            mainPtr = mainPtr.next;
            refPtr = refPtr.next;
        }

        // Return the data of the mainPtr, which is now the nth node from the end
        return mainPtr.data;
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

    // Constant for an empty list
    public static final int LIST_EMPTY = -1;

    public static void main(String[] args) {
        NthNode list = new NthNode();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int n = 2;
        int result = list.nthFromLast(n);
        
        if (result == LIST_EMPTY) {
            System.out.println("List is empty or n is larger than the list size.");
        } else {
            System.out.println("The " + n + "th node from the end is: " + result);
        }
    }
}
