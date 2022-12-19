import java.util.Arrays;

public class ArrangeZerosOnes {
    public static void main(String args[])
    {
        int array[]=new int[]{1, 2, 2, 0, 0, 1, 2, 2, 1};
        for(int i=0;i< array.length;i++)
            for(int j=i+1;j< array.length;j++)
            {
                if(array[i]>array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
       for(int i=0;i<array.length;i++)
           System.out.print(array[i]+", ");
    }
}
