import java.util.Scanner;
public class Fabonacci_Recursion {

    public static int Fab(int a,int b, int n){
      if(n<=0)
        return  n ;

        System.out.println(a+" ");
         return Fab(b,a+b,n-1);
      
      
    }
    public static void main(String []args){
      long start =System.currentTimeMillis();
        Fabonacci_Recursion f = new Fabonacci_Recursion();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number ");
        int j=s.nextInt();
        System.out.println();
        f.Fab(0,1,j);
        long end = System.currentTimeMillis();
        long totalTime=end-start;
        System.out.println("Total time is "+ totalTime);

       
    }

}





