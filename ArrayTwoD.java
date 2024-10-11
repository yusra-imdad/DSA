import java.util.*;
class ArrayTwoD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();

        int arr[][]=new int[rows][columns];
        System.out.println("Enter elements in array :");
        for (int i=0;i<rows;i++){ // user input 
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
           for(int j=0;j<columns;j++){
            if(arr[i][j]==x){
           System.out.println("Element found at index " +i+j);
            
        }
        
            }
           
               
           }
        }

    }
    

