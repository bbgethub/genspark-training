public class LargestSumContiguousSubarray {
    public static void main(String args[])
    {
        int[] a = { -2, 1, -3, 4, -1, 2, 1, -5,4 };
        int max_end=0,max_so_far=Integer.MIN_VALUE;
        int start=0,end=0,s=0;
        for(int i=0;i<a.length-1;i++)
        {
            max_end+=a[i];
            if(max_so_far<max_end) {
                max_so_far = max_end;
                start=s;
                end=i;
            }
            if(max_end<0) {
                max_end = 0;
                s=i+1;
            }

        }
        System.out.println("Maximum sum: "+max_so_far);
        System.out.println("SubString is: ");
        for(int i=start;i<=end;i++)
            System.out.print(a[i]);
    }
}
