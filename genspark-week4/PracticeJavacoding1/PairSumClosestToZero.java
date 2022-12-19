public class PairSumClosestToZero {
    public static void main(String args[])
    {
           int array[]={1,3,-5,7,8,20,-40,6};
           int minSum=array[0]+array[1];
           int firstElement=array[0];
           int secondElement=array[1];
          // Arrays.sort(array);
           for(int i=0;i<array.length-1;i++)
           {
               for(int j=i+1;j<array.length;j++) {
                   int temp = array[j] + array[i];
                   if(Math.abs(temp)<Math.abs(minSum))
                   {
                       firstElement= array[i];
                       secondElement=array[j];
                   }

               }

           }
        System.out.println("Close to Zero Pair is: "+firstElement+","+secondElement);
    }
}
