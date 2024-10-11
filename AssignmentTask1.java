class Node{
    int data;
    Node next;

    Node (int data){
        this.data=data;
        this.next=null;
    }
}

public class AssignmentTask1 {
    Node head;

    public int nthFromLast(int n){
        if(head==null){
            return List_Empty;
        }
        Node mainPtr=head;
        Node refPtr=head;
    
    for(int i=0;i<n;i++){
        if(refPtr==null){
       return List_Empty;
    }
    refPtr=refPtr.next;

        }
   while(refPtr!=null){
    mainPtr=mainPtr.next;
    refPtr=refPtr.next;
   }
   return mainPtr.data;
   }

   public void addtoLast(int data){
    Node newNode=new Node(data);
    Node temp=head;
    if (head==null){
        head=newNode;
    }
    else{
        while(temp!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
   }

    static final int List_Empty=-1;

   public static void main(String []args){
    AssignmentTask1 list=new AssignmentTask1();
    list.addtoLast(10);
    list.addtoLast(20);
    list.addtoLast(30);
    list.addtoLast(40);
    list.addtoLast(50);
    int n=2;
    int result=list.nthFromLast(n);
   }
}