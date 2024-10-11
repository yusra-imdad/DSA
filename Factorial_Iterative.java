import java.util.Scanner;
public class Factorial_Iterative {
    public static int fact(int n){
        if (n==0||n==1){
            return 1;
        }
        else {
            int result = 1;
            for (int i=1;i<=n;i++) {
                result*=i;
        }
           return result;

    }
    }
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number you want the factorial of - ");
        int j=s.nextInt();
       System.out.println("Factorial of "+j+" is :"+fact(j));
       long end=System.currentTimeMillis();
       long totalTime=end-start;     
       System.out.println("Total time is "+totalTime);  
    }
    
}
