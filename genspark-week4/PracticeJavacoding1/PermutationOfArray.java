import java.util.ArrayList;
import java.util.List;

public class PermutationOfArray {
    public static void main(String args[])
    {
        int array[]=new int[]{10,20,30};
        List<List<Integer>> list=permutation(array);
        for(List<Integer> temp:list)
        {
            System.out.println(temp);
        }
    }

    public static List permutation(int array[])
    {
        List<List<Integer>> list=new ArrayList<>();
        list=permutationHelper(list,new ArrayList<>(),array);
        return list;
    }

    public static List permutationHelper(List<List<Integer>> list,List<Integer> arrayList,int[] array)
    {
        if (arrayList.size()==array.length)
        {
            list.add(new ArrayList<>(arrayList));
        }
        else{
            for(int i=0;i<array.length;i++)
            {
                if(arrayList.contains(array[i])) {
                    continue;
                }
                    arrayList.add(array[i]);
                    permutationHelper(list,arrayList,array);
                    arrayList.remove(arrayList.size()-1);
            }
        }
        return list;
    }
}
