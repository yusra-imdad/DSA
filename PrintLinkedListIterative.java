class Node{
 
    int data;
    Node next;
  
    Node(int data){
    this.data=data;
    this.next=null;
}


 }

public class PrintLinkedListIterative {

    Node head;

    public void addToFront(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    public void addToback(int data){
        Node temp=head;
        Node newNode=new Node(data);
        while(temp.next!=null){
            temp=temp.next;
          
        }
        temp.next=newNode;

    }
    public void addAt(int data,int index){
        Node temp=head;
        Node newNode=new Node(data);
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void printlist(){
        if(isEmpty()){
            System.out.println("List is empty");
        }
        else {
            Node temp=head;
            while(temp.next!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.print(temp.data+" ");
            System.out.println(" ");
        }
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        PrintLinkedListIterative p=new PrintLinkedListIterative();
        System.out.println("After calling add to front method ");
        p.addToFront(4);
        p.addToFront(2);
        p.addToFront(1);
        p.printlist();

        System.out.println("After calling add to back method");
        p.addToback(5);
        p.printlist();
        System.out.println("After calling add at method");
        p.addAt(3, 2);
        p.printlist();
        System.out.println(p.isEmpty()?"List is Empty":"list is not Empty");


    }
    
}