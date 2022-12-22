import java.util.*;

public class FrequencyOfEachElement {
    public static void main(String args[]) {
        int[] nums = { 2, 2, 4, 4, 4, 5, 5, 6, 8, 8, 9 };
        HashMap<Integer,Integer> map=new HashMap<>();
        int end=nums.length-1;
        findDuplicationCount(nums,0,end,map);
        System.out.println(map);

    }

    public static void findDuplicationCount(int[] nums,int start, int end,HashMap<Integer,Integer> map)
    {
        if(start>end)
            return;
        if(nums[start]==nums[end]) {
            Integer count = map.get(nums[start]);
            if (count == null)
                count = 0;
            map.put(nums[start], count + (end - start + 1));
            return;
        }
            int mid=(start+end)/2;
            findDuplicationCount(nums,start,mid,map);
            findDuplicationCount(nums,mid+1,end,map);
    }
}
