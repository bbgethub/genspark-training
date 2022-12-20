import java.util.Arrays;

public class RotateArrayKpositions {
    public static void main(String args[])
    {
        int array[]=new int[]{1, 2, 3, 4, 5, 6};
        int N=6,k=2;
        for(int i=0;i<k;i++)
        {
            for(int j=array.length-1;j>0;j--)
            {
                int temp=array[j];
                array[j]=array[j-1];
                array[j-1]=temp;
            }

        }
        for(int i=0;i< array.length;i++)
            System.out.print(array[i]);
    }

}
