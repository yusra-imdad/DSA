class Node {
    int data;
    Node next;
   

    Node (int data){
        this.data=data;
        this.next=null;
    }
} 
class LinkedList{
    static int size = 0;
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
        size++;  
      }
      void addToFront(int data){
        Node newNode=new Node(data);
        Node temp=head;
       head=newNode;
       newNode.next=temp;
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
      
     
 int getSize(){
  return size;
  
}
}

class LengthLL{
   public static void main(String []args){
    NthNode link=new NthNode();
    link.addToBack(2);
    link.printList();
    link.addToFront(1);
    link.printList();
System.out.println("Size of linkedlist is "+link.getSize());
   }
}