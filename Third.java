public class Third {
    
    private Node head; 
    private int size;

    public Third() {
        head = new Node(0);
        size = 0;
    }

    private class Node
    {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public boolean isEmpty()
    {
        return size == 0;
    }

    public int size()
    {
        return size;
    }



    public void add(int data) 
    {
        Node newNode = new Node(data);
        Node temp = head;

        // Traverse to the end of the list
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    public void add(int index, int data)
     {
        if (index < 1 || index > size + 1) {
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    
    public void remove(int index) {
        if (index < 1 || index > size) {
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void Remove(int data)
     {
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data==data) {
                temp.next = temp.next.next;
                size--;
                return;
            }
            temp = temp.next;
        }
    }


void printlist()
{
    Node temp=head;
    while(temp!=null)
    {
    System.out.print(temp.data+" ");
    temp=temp.next;
    }
}
    
    public static void main(String[] args) {
        Third list = new Third();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.print("Original list: ");
        list.printlist();
        System.out.println();

        list.add(2, 5);
        System.out.print("After adding 5 at index 2: ");
        list.printlist();
        System.out.println();
        
        list.remove(3);
        System.out.print("After removing item at index 3: ");
        list.printlist();
        System.out.println();

        list.Remove(5);
        System.out.print("After removing 5 ");
        list.printlist();
        System.out.println();

    }
}