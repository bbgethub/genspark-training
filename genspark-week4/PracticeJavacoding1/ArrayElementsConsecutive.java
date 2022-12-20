import java.util.Arrays;

public class ArrayElementsConsecutive {
    public static void main(String args[])
    {
        int array[] = new int[]{6, 7, 5, 6};
        int l=array.length;
        Arrays.sort(array);
        int first=array[0];
        System.out.println(findDuplicate(array,l));

    }
    public static boolean findDuplicate(int array[],int l)
    {
        for(int i=0;i<l;i++)
            for(int j=i+1;j<l;j++)
            {
                if(array[i]==array[j])
                    return false;
            }
        return true;
    }
}
