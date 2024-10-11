class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    Node head;
    int size=0; 
    void addToBack(int data){
        Node newNode=new Node(data);
        if(head==null) {
            head=newNode;
         }
         else{
            Node temp=head;
           while(head.next!=null) {
            temp=temp.next;
           }
           temp.next=newNode;
         }
         size++;
        
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
     size++;
    }
    int getSize(){
        return size;
        
      }
    boolean SearchElement(int value){
    Node temp=head;
    while(temp!=null){
      if(temp.data==value){
      return true;
      }
      temp=temp.next;
      }
     return false;
    }
    

    }
      
public class SearchLL {
    public static void main(String [] args){
    LinkedList link_2 = new LinkedList();
    link_2.addToBack(2);
    link_2.addToFront(1);
    link_2.printList();
    link_2.SearchElement(1);
    System.out.println("Size of linked list is "+link_2.getSize());
    int value=3;
    boolean isFound=link_2.SearchElement(value);
    if(isFound){
        System.out.println("Element "+ value+"is found");
    }
    else {
        System.out.println("element "+value+ " is not found");
    }
    }
}