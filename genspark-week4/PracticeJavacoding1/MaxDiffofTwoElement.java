public class MaxDiffofTwoElement {
    public static void main(String args[])
    {
        int arr[]={14, 12, 70, 15, 75, 95, 22, 30};
        int min=arr[0];
        int start = 0,max;

        for(int i=1;i<arr.length-1;i++)
            if(min>arr[i])
                min=arr[i];
        max=min;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==min)
                start=i;
        }
        for(int i=start+1;i< arr.length-1;i++)
            if(max<arr[i])
            {
                max=arr[i];
            }
        System.out.println("Minmum Value: "+min);
        System.out.println("Maximum Value Occures after Min: "+max);
        int diff=max-min;
        System.out.println("Difference "+diff);

        //Another method
        for(int i=0;i<arr.length;i++)
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        System.out.println("min value:"+arr[0]);
        System.out.println("max value:"+arr[arr.length-1]);
        int diff1=arr[arr.length-1]-arr[0];
        System.out.println("Diff:"+diff1);
    }
}
