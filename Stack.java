public class Stack {
    private int arr[];
    private int top;
    private int capacity;
   
    Stack(int size){
        arr= new int [size];
        capacity = size;
        top=-1;
    }

     
    public int push(int x){
           if(isEmpty()){
             return arr[++top]=x;
           }
           else {
            System.out.println("Stack is full");
            return 0;
           }
          
           
           
    }    
    public int pop() {
        return arr[top--];

    }
    
   public  int top() {
    return arr[top];

    }
    public int size(){
        return top+1 ;
    }
    boolean  isEmpty(){
        if(top<arr.length){
          return true;
        }
        else{
          return false;
        }
      }
      public boolean isFull(){
      if (top==arr.length){
        return true;
      }
      else{
        return false;
      }
      }

      public static void main(String[] args) {
        Stack stack=new Stack(3);
        
        System.out.print("Inserting ");
        System.out.println(stack.push(1));
        stack.push(2);
        System.out.println("Inserting 2");

        stack.pop();
        System.out.println("Removing 2");
        stack.pop();
        System.out.println("Removing 1");

        stack.push(3);
        System.out.println("Inserting 3");

        System.out.println("Top element is :"+stack.top());
        System.out.println("Stack size is :"+stack.size());

        stack.pop();
        System.out.println("Removing 3");

        if(stack.isEmpty()){
            System.out.println("Stack Is Empty");
        }
        else{
            System.out.println("Stack Is full");
        }
    }
}
