import java.util.Arrays;
public class Sorting {
   
 public void insertion(int arr[]){
        int i, j, temp;
        for (i=1;i<arr.length;i++){
          j=i-1;
          temp=arr[i];

          while(j>=0&&arr[j]>temp){
            arr[j+1]=arr[j];
            j--;
          }
          arr[++j]=temp;
        }

    }

    public void selection(int arr1[]){
        int i,j,min_ind;

        for(i=0;i<arr1.length-1;i++){
            min_ind=i;
            for (j=i+1;j<arr1.length;j++){
                if(arr1[j]<arr1[min_ind]){
                    min_ind=j;
                   
                }
                int temp=arr1[min_ind];
                arr1[min_ind]=arr1[i];
                arr1[i]=temp;
            }
           
        }

    }
    public void mergeSort(int arr[]){
        if(arr==null){
            return;
        }

        if(arr.length>1){
            int mid=arr.length/2;
            int []left=new int[mid];
            for(int i = 0; i < mid; i++)
            {
                left[i] = arr[i];
            }
             
            // Split right part
            int[] right = new int[arr.length - mid];
            for(int i = mid; i < arr.length; i++)
            {
                right[i - mid] = arr[i];
            }
            mergeSort(left);
            mergeSort(right);
 
            int i = 0;
            int j = 0;
            int k = 0;
 
            // Merge left and right arrays
            while(i < left.length && j < right.length)
            {
                if(left[i] < right[j])
                {
                    arr[k] = left[i];
                    i++;
                }
                else
                {
                    arr[k] = right[j];
                    j++;
                }
                k++;
            }
            // Collect remaining elements
            while(i < left.length)
            {
                arr[k] = left[i];
                i++;
                k++;
            }
            while(j < right.length)
            {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
    }
 
    public static void main(String[] args)
    {
        int []arr={3,2,8,6,5,0};
        int []arr1={5,4,3,0,1};
        int []arr2={3,8,6,9,4,1};
        Sorting s= new Sorting();
        
    System.out.println("Original array "+Arrays.toString(arr));
    
    s.insertion(arr);
    System.out.println("after insertion sorting  "+Arrays.toString(arr));
    
    System.out.println("Original Array "+Arrays.toString(arr1));
    
    s.selection(arr1);
    System.out.println("After selection Sorting "+Arrays.toString(arr1));
    
    s.mergeSort(arr2);
        System.out.println("After merge Sorting");
 
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}