class Node {
    int data;
    Node next;
  
    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
  }
  
  class LinkedList {
    Node head;
  
    void addToBack(int data) {
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
  
    void printList() {
        Node node = head;
        if (node == null) {
            System.out.println("List is empty.");
            return;
        }
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println(); // For new line after printing list
    }
  
    void addToFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
  
    void addToMiddle(int index, int data) {
        if (index < 1) {
            System.out.println("Index out of bounds");
            return;
        }
  
        Node newNode = new Node(data);
        if (index == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
  
        Node temp = head;
        for (int i = 1; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }
  
        newNode.next = temp.next;
        temp.next = newNode;
    }
  
    void removeFromFront() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }
  }
  
  public class SinglyLL {
    public static void main(String[] args) {
        LinkedList link_1 = new LinkedList();
        link_1.addToBack(1);
        link_1.addToBack(2);
        link_1.printList(); // Output: 1 2
        link_1.addToFront(3);
        link_1.printList(); // Output: 3 1 2
        link_1.addToMiddle(2, 4);
        link_1.printList(); // Output: 3 4 1 2
        link_1.removeFromFront();
        link_1.printList(); // Output: 4 1 2
    }
  }
  class Node{
    int data;
    Node next;

    //Constructor

    Node(int data){
        this.data=data;
        this.next=null;
    }

}

class LinkedList{
 Node head;
 
 void addToBack(int data){
    Node newNode=new Node(data);
    if(head==null){
        newNode.next=head;
        head=newNode;
    }
    else {
      Node temp=head;
      while(temp.next!=null){
        temp=temp.next;
        
      }
      temp.next=newNode;


    }  
 }

 void printList(){
      
    Node node=head;
    while(node.next!=null){
        System.out.print(node.data+" ");
        node=node.next;
    }
    // it will print last node data.
    System.out.print(node.data+" ");
  }

  void addToFront(int data){
      Node newNode=new Node(data);
    Node temp=head;
    head=newNode;
    newNode.next=temp;

  }

  void addToMiddle(int Index, int data){
    Node newNode=new Node(data);
    Node temp=head;
    for(int i=1;i<Index-1;i++){
        temp=temp.next;
    }
    newNode.next=temp.next;
    temp.next=newNode;
  }

}

void removeFromFront(){
 if(head == null)

}

public class SinglyLL {
    public static void main(String []args){
        LinkedList link_1=new LinkedList();
        link_1.addToBack(1);
        link_1.addToBack(2);
        link_1.printList();
         link_1.addToFront(3);
         link_1.printList();
         link_1.addToMiddle(3,4);
         link_1.printList();
        }
    
}

