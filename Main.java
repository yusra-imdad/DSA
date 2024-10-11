import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 7, 2, 2, 7, 8, 9};
        int i=0;
    for (int j=0; j<array.length;j++){
        if (array[j]%2!=0) {
            int temp=0;
            temp=array[i];
            array[i]=array[j];
            array[j] = temp;
            i++;
        }
       
    }
    System.out.println(Arrays.toString(array));
}
}
