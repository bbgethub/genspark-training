public class PairSumCloseToX {
    public static void main(String arg[])
    {
        int array[]=new int[]{-40,-5,1,3,6,7,8,20};
        FindPairCloseToX(array,5);
    }
    public static void FindPairCloseToX(int[] array,int x)
    {
        int minSum=Math.abs(array[0]+array[1]-x);
        int firstElement=array[0];
        int secondElement=array[1];
        for(int i=0;i<array.length;i++)
            for(int j=i+1;j< array.length;j++)
            {
                int temp=Math.abs(array[i]+array[j]-x);
                if(temp<minSum) {
                    firstElement = array[i];
                    secondElement = array[j];
                    minSum = temp;
                }
            }
        System.out.println("Minimum Sum Close to "+x+"are :"+firstElement+","+secondElement);
    }
}
