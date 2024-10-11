import java .util. Arrays;

public class CopyArray{
    public static void main(String []args){

        int array[][]={{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7},{4,5,6,7,8}};
        int temp[]=new int[20];
        int index=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                int value =array[i][j];
                boolean dup=false;
                
                for (int k=0;k<index;k++){
                    if (temp[k]==value)
                    {
                        dup=true;
                        break;
                    }
                }
                if(!dup==true && index <temp.length)
                {
                    temp[index]=value;
                    index++;
                }
            }
        }
        for (int i=0;i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }
    }
    

}