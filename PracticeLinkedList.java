class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
    public class PracticeLinkedList {
        Node head;

        public void addToFront(int data){
            Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            
         }
         else{
           newNode.next=head;
           head=newNode;  
         }
        }
        public void removeFirst(){
            if(isEmpty()){
                System.out.println("Sorry list is Empty!");
            }
            else {
                head=head.next;
            }
        }
        public void removeMiddle(int index){
            if(index==1){
                removeFirst();
            }
            else{
                Node temp=head;
             for (int i=0;i<index-1;i++){
                temp=temp.next;
             }
             temp.next=temp.next.next;

            }
        }
        public void removeLast(){
            if(isEmpty()){
                System.out.println("Sorry list is Empty!");
            }
            else{
                Node temp=head;
                while(temp.next.next!=null){
                    temp=temp.next;
                }
                temp.next=null;
                

            }

        }
        public void addtoMiddle(int data,int index){
            Node newNode=new Node(data);
            Node temp=head;
            if(isEmpty()){
               addToFront(data);
           }
           for(int i=0;i<index-1;i++){
            temp=temp.next;
           }
           newNode.next=temp.next;
            temp.next=newNode;


    }

        public void addToback(int data){
            Node newNode=new Node(data);
          if(isEmpty()){
             head=newNode;
          }
          else {
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=null;
          }
        }
        public boolean isEmpty(){
            if(head==null)
                return true;
            else{
                return false;
            }
        }
        
        public void printlist(){
            Node node=head;
            while(node.next!=null){
                
                System.out.print(node.data+" ");
                node=node.next;
            }
            System.out.print(node.data+" ");
            System.out.println(" ");
        }
        public static void main(String []args){
            PracticeLinkedList n=new PracticeLinkedList();
           
            n.addToFront(3);;
            

            n.addToFront(2);
            

            n.addToFront(1);
        
            n.addToback(5);
            
            n.printlist();
            n.addtoMiddle(4, 3);
            n.printlist();
            System.out.println(n.isEmpty()?"List is Empty":"List is  not Empty");
            n.removeFirst();
            n.removeLast();
            n.printlist();
            n.removeMiddle(2);
            n.printlist();
        }
    
}
