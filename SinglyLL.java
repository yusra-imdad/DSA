public class Node{
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
  Node head;
if(head == null){
  System.out.println("List is already empty");
}
else {
  head=head.next;
}
}

void removeAt(int index){
  Node head;
    if (head==1){
      removeFromFront();
    }
    else{
    Node n=head;
    Node temp=null;
    for(int i=1; i<index;i++){
      n=n.next;
    }
    temp=n.next;
    n.next=temp.next;
    }
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
       link_1.removeAt(3);
      }
  
}

