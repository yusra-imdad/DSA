class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyTail {
    Node head = null, tail = null;

    public void addToFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void addToLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removefirst() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (tail == null) {
            System.out.println("LL is empty");
            return;
        }
        if (tail.prev == null) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        DoublyTail t = new DoublyTail();
        t.addToFront(2);
        t.addToLast(3);
        t.addToFront(1);
        t.addToLast(4);

        System.out.println("After adding nodes:");
        t.printList();

        t.removefirst();
        System.out.println("After removing first:");
        t.printList();

        t.removeLast();
        System.out.println("After removing last:");
        t.printList();
    }
}
