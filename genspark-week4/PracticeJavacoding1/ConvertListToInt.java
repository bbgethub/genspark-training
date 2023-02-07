import java.util.*;

public class ConvertListToInt {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 30, 40, 50, 70, 5,40));
        int array1[] = list.stream().mapToInt(Number::intValue).toArray();

        int l = (int) list.size();
        int[] array2 = new int[list.size()];
        for (int i = 0; i < l; i++) {
            array2[i] = list.get(i);
            System.out.println("array2:"+array2[i]);
            System.out.println("array1:"+array1[i]);
        }
        Arrays.sort(array2);
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<array2.length;i++)
            list2.add(array2[i]);
        System.out.println("List2: "+list2);
    Set<Integer> set=new TreeSet<>(list);
        System.out.println("Set "+set);
        List<Integer> list3=new ArrayList<>(set);
        System.out.println("Removed duplicates:"+list3);
    }
}
