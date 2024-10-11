class Node {
  String name;
  Node next;
  Node prev;

  Node(String name) {
      this.name = name;
      this.next = null;
      this.prev = null;
  }
}

public class DoublyLinkedList {
  Node head;

  public void insertAtBeginning(String name) {
      Node newNode = new Node(name);
      if (head == null) {
          head = newNode;
      } else {
          newNode.next = head;
          head.prev = newNode;
          head = newNode;
      }
  }

  
  public void insertAtBeginning(Node node) {
      if (head == null) {
          head = node;
      } else {
          node.next = head;
          head.prev = node;
          head = node;
      }
  }

  
  public void insertAtEnd(String name) {
      Node newNode = new Node(name);
      if (head == null) {
          head = newNode;
      } else {
          Node temp = head;
          while (temp.next != null) {
              temp = temp.next;
          }
          temp.next = newNode;
          newNode.prev = temp;
      }
  }

  
  public void insertAtEnd(Node node) {
      if (head == null) {
          head = node;
      } else {
          Node temp = head;
          while (temp.next != null) {
              temp = temp.next;
          }
          temp.next = node;
          node.prev = temp;
      }
  }

  
  public void insertAfterName(String name, Node node) {
      Node temp = head;
      while (temp != null) {
          if (temp.name.equals(name)) {
              node.next = temp.next;
              node.prev = temp;

              if (temp.next != null) {
                  temp.next.prev = node;
              }

              temp.next = node;
              return;
          }
          temp = temp.next;
      }
      System.out.println("Node with name " + name + " not found.");
  }

  
  public void insertBeforeName(String name, Node node) {
      Node temp = head;
      while (temp != null) {
          if (temp.name.equals(name)) {
              node.next = temp;
              node.prev = temp.prev;

              if (temp.prev != null) {
                  temp.prev.next = node;
              } else {
                  head = node;  
              }

              temp.prev = node;
              return;
          }
          temp = temp.next;
      }
      System.out.println("Node with name " + name + " not found.");
  }

  
  public void makeCircular() {
      if (head == null) return;

      Node tail = head;
      while (tail.next != null) {
          tail = tail.next;
      }

      tail.next = head;  
  }

  public void printList() {
      if (head == null) {
          System.out.println("List is empty.");
          return;
      }

      Node n = head;
      do {
          System.out.print(n.name + " ");
          n = n.next;
      } while (n != null && n != head);  
      System.out.println();
  }

  public static void main(String[] args) {
      DoublyLinkedList list = new DoublyLinkedList();
      Node node1 = new Node("Hannah");
      Node node2 = new Node("Grace");
      Node node3 = new Node("**");

      list.insertAtBeginning("I");
      list.insertAtEnd("am");
      list.insertAtEnd("student");
      list.insertAtEnd(node1);
      list.insertAtEnd(node2);
      list.insertAtBeginning(node3);
      
      list.insertAfterName("Hannah", new Node("afterHannah"));
      list.insertBeforeName("Grace", new Node("beforeGrace"));

      // Make list circular
      list.makeCircular();

      // Print the list
      list.printList();  // Works for circular lists as well
  }
}
