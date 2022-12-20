public class MaximizeProfitPair {
    public static void main(String args[])
    {
        int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
        int buy=arr[0];
        int sell=arr[1];
        int buyDay=0,sellDay=0;
        int length=arr.length;
        for(int i=1;i<length;i++)
            if(buy>arr[i])
            {
                buy=arr[i];
                buyDay=i;
            }
        for(int j=0;j<length;j++)
            if(sell<arr[j])
            {
                sell=arr[j];
                sellDay=j;
            }
            System.out.println("Day to buy stock :" + buyDay);
            System.out.println("Day to sell stock :" + sellDay);
    }
}
