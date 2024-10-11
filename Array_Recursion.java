public class Array_Recursion {
    static char[]arr={'a','b','c','d','e'};
    public static void ArrayForward(int n){
     if(n>=arr.length){
        return;
     }
       System.out.print(arr[n]+",");
       ArrayForward(n+1);
    }
    public static void ArrayBackward(int n){
        if(n < 0){
            return;
        }
        System.out.print(arr[n]+",");
        ArrayBackward(n-1);
       
        
    }
    public static void main(String[]args){
        System.out.print("Forward Array : {");
        ArrayForward(0);
        System.out.print("}");
        System.out.println();
        System.out.print("Backward Array : {");
        ArrayBackward(arr.length-1);
        System.out.print("}");
    }
    
}
