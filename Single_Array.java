import java.util.*;
public class Single_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size :");
        int size=sc.nextInt();

        int arr[]=new int[size];
        
        System.out.println("Enter elements in array ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println("Enter element you want to search :");
        int x=sc.nextInt();

        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("The number "+x+" found at Index "+i);
            }
        }
    }
    
}
