class Queue {
    private int arr[];
    private int front;
    private int rear;
    private int capacity;
    private int count;

    Queue(int size){
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = 0;
        count = 0;

    }
    public void enqueue(int item) {
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }

     arr[rear]=item;
     rear=(rear+1)%capacity;
     count++;
    
    }

    public int dequeue(){
       if(isEmpty()){
        System.out.println("Queue is Empty");
        return-1;
       }
       int item=arr[front];
       front =(front+1)%capacity;
       count--;
       return item;

    }
 

public int peek(){
    if(isEmpty()){
        System.out.println("Queue is Empty");
        return-1;
    }
     return arr[front];

    }


public int size(){
    return count;
}

public boolean isFull(){
    return count==capacity;
}

public boolean isEmpty(){
    return count==0;
}
    
}

class ArrayQueue{
    public static void main(String[] args) {
        Queue que = new Queue(5);
      
        System.out.println("Inserting 1");
        que.enqueue(1);
        que.enqueue(2);
        System.out.println("Inserting 2");
        que.enqueue(3);
        System.out.println("Inserting 3");

        System.out.println("Front element is :"+que.peek());
        System.out.println("Removing 1");
        que.dequeue();
        System.out.println("Front element is :"+que.peek());
        System.out.println("Queue size is :"+que.size());

       System.out.println("Removing 2");
        que.dequeue();
        System.out.println("Removing 3");
        que.dequeue();

        if(que.isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println("Queue is not Empty");
        }
       

    }
}