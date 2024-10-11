public class Fabonacci_Iterative {
    public static int Fabonacci(int a ,int b, int n){
        if (n<=0){
            return n;
        }
            for(int i=1;i<=n;i++){
            System.out.println(a + " ");
            int next=a+b;
            a=b;
            b=next;
            }
            return n;
        }

    
    public static void main(String []args){
        long start=System.currentTimeMillis();
        Fabonacci_Iterative f=new Fabonacci_Iterative();
        f.Fabonacci(0,1,10);
        long end=System.currentTimeMillis();
        long totalTime=end-start;
        System.out.println("Total time is "+totalTime);
    }
} 
