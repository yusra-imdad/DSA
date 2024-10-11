import java.util.Scanner;
class Simple_Recursion {

    public static void recursion(int n){
        if (n<=0){
            return;
        }

   System.out.print(n + ",");
    
    recursion(n-1);
    System.out.println();
    System.out.print(n);
    }
    public static void main(String []args){
        System.out.print("Numbers : ");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number ");
        int j=s.nextInt();
        recursion(j);
       
        
    }
    
}
