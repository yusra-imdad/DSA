class Node{

    int data;
    Node next;
   

    Node(int data){
     this.data=data;
     this.next=null;
    }

}

class StackLinkedList{
 Node head;
 int size=0;

 
    public void push(int data){
        Node newNode = new Node(data);
      if(isEmpty()){
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
      
      public int top(){
        if (isEmpty()){
            return-1;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            return temp.data;
      }
    }
    

    public int pop(){
        Node temp=head;
        if(isEmpty()){
        return -1;
        }
        else{
            while(temp.next.next!=null){
            temp=temp.next;
            }
          temp.next=null;
        } 
        size--;
        return temp.data;
        
    }

 

 public boolean isEmpty(){
    if(head==null){
     return true;
    }
    else {
    return false;
    }
 }
}
 public class MainStack{
    public static void main(String[] args) {
        StackLinkedList stack=new StackLinkedList();
        System.out.println("Inserting 1");
        stack.push(1);
        
        stack.push(2);
       System.out.println("Inserting 2");
        stack.push(3);
        System.out.println("Inserting 3");

        System.out.println("Top element is "+stack.top());

        stack.pop();
        System.out.println("Removing 3");
        stack.pop();
        System.out.println("Removing 2");
        stack.pop();
        System.out.println("Removing 1");

        if(stack.isEmpty()){
           System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is not empty");
        }
    }
}