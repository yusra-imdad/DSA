class Node {
  int data;
  Node next;

  public Node(int data) {
      this.data = data;
      this.next = null;
  }
}

class QueueLinkedList {
  private Node rear = null, front = null;

  public int dequeue() {
      if (isEmpty()) {
          System.out.println("Queue is Empty");
          return -1;
      } else {
          int temp = front.data;
          front = front.next;
          if (front == null) {
              rear = null;
          }
          return temp;
      }
  }

  public void enqueue(int data) {
      Node newNode = new Node(data);
      if (rear == null) {
          front = rear = newNode;
      } else {
          rear.next = newNode;
          rear = newNode;
      }
  }

  public int peek() {
      if (isEmpty()) {
          System.out.println("Queue is Empty");
          return -1;
      }
      return front.data;
  }

  public boolean isEmpty() {
      return front == null;
  }
}

class MainQueLinkedList {
  public static void main(String[] args) {
      QueueLinkedList q = new QueueLinkedList();
      System.out.println("Inserting 1");
      q.enqueue(1);
      System.out.println("Inserting 2");
      q.enqueue(2);
      System.out.println("Inserting 3");
      q.enqueue(3);
      System.out.println("Inserting 4");
      q.enqueue(4);

      System.out.printf("Front element is: %d%n", q.peek());
     
      System.out.println("Removing 1");
      q.dequeue();
      System.out.println("Removing 2");
      q.dequeue();
      System.out.println("Removing 3");
      q.dequeue();
      System.out.println("Removing 4");
      q.dequeue();

      if (q.isEmpty()) {
          System.out.println("Queue is empty");
      } else {
          System.out.println("Queue is not Empty");
      }
  }
}
