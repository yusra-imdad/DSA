import java.util.Scanner;
public class Factorial_Recursive {
    
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }

    }

    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number you want factorial of _ ");
        int j=s.nextInt();
        int result=fact(j);
        System.out.println("Factorial of "+j+" is :"+result);
        long end=System.currentTimeMillis();
        long totalTime=end-start;
        System.out.println("total time is "+totalTime);
        
    }
}
