public class DecimalToBinary {
    public static void main(String[] args) {
        
            int decimal_Number=13;//example
            String binary_String=decTobin(decimal_Number);
            System.out.println("Binary of "+decimal_Number+" is "+binary_String);
    }
            public static String decTobin(int num){
               if(num==0){
                return "";
               }
               else{
                return decTobin(num/2)+(num%2);
               }

        
            }
    }
    

