import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingNumbers {
    public static void main(String arg[])
    {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,10,12,15,20,21,22,23,29,31));
        List<Integer> result=missingNumFunction(list);
        System.out.println("Missing Numbers: "+Arrays.toString(result.toArray()));
    }

    public static List<Integer>missingNumFunction(List<Integer> list)
    {
        List<Integer> result=new ArrayList<Integer>();
        int last=list.size()-1;
        for(int i=0,j=1;i<list.size();i++,j++)
        {
            int temp1=(int)list.get(i);
            if(temp1!=j)
            {
               for(int k=j;k<temp1;k++)
               {
                  result.add(k);
               }
               j=temp1+1;
            }

        }
        int lastElement=list.get(last);
        for(int i=lastElement;i<35;i++)
            result.add(i+1);
        System.out.println("LastElement: "+lastElement);
        return result;
    }
}
