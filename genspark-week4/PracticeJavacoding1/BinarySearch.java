public class BinarySearch {
    public static void main(String args[])
    {
        int array1[]=new int[]{2,5,7,10,12,8,9};
        int num=10;
        int index=searchMethodBinary(array1,0,array1.length-1,num);
        if(index==-1)
            System.out.println("Not found");
        else
            System.out.println("Index of "+num+" is :"+index);
    }
    public static int searchMethodBinary(int[] array1,int start, int end, int num)
    {
        if(start>end)
            return -1;
        else if (end >= start)
        {
            int mid=start+(end-start)/2;
            if(array1[mid]==num)
                return mid;
            else if(array1[mid]>num)
                return searchMethodBinary(array1,start,mid-1,num);
            return searchMethodBinary(array1,mid+1,end,num);
        }
        return -1;
    }
}
