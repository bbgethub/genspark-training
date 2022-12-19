import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OccuringOddNumTimes {
    public static void main(String arg[])
    {
        int[] array=new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
       // Set<Integer> set=new HashSet<>();
        int result=0;
       // Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< array.length;i++) {
            result=result^array[i];
        }
        System.out.println("result: "+result);
    }
}
