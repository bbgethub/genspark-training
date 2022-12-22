public class ContiguousSubarraySumEqaulX {
    public static void main(String args[])
    {
        int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
        int X =97;
        int currentSum,start=0,end=0;
        for(int i=0;i< arr.length;i++)
        {
            currentSum=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                if(currentSum==X)
                {
                    end=j-1;
                    start=i;
                }
                if(currentSum>X||j==arr.length)
                    break;
                currentSum+=arr[j];
            }

        }
        System.out.print("{");
        for(int i=start;i<=end;i++)
            System.out.print(arr[i]+",");
        System.out.println("}");
    }
}
