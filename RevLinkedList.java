class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    int size = 0;

    public void addToFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void printOriginal() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public void printReverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Iterate for each element in reverse order
        for (int i = size - 1; i >= 0; i--) {
            Node temp = head;
            // Traverse to the (i-th) node
            for (int j = 0; j < i; j++) {
                temp = temp.next;
            }
            System.out.print(temp.data + " ");
        }
        System.out.println();
    }
}

public class RevLinkedList {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.addToFirst(4);
        li.addToFirst(3);
        li.addToFirst(2);
        li.addToFirst(1);

        System.out.println("Original List:");
        li.printOriginal();

        System.out.println("Reversed List:");
        li.printReverse();
    }
}
