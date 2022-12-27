import java.util.Arrays;

public class ArrayElementsConsecutive {
    public static void main(String args[])
    {
        int array[] = new int[]{6, 7, 5, 1};
        int l=array.length;
        Arrays.sort(array);
        int first=array[0];
        System.out.println(findDuplicate(array,l));
        if(areConsecutive(array)==true)
            System.out.println("Array elements are consecutive");
        else
            System.out.println(("Array elements are not consecutive"));

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

    public static boolean areConsecutive(int array[])
    {
        Arrays.sort(array);
        for(int i=1;i< array.length;i++)
        {
            if(array[i]!=array[i-1]+1)
                return false;
        }
        return true;
    }
}
