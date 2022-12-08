import java.util.ArrayList;
import java.util.List;

public class PairSumCloseToZero {

	//Find a Pair Whose Sum is Closest to zero in Array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(-5);
		list.add(7);
		list.add(8);
		list.add(20);
		list.add(-40);
		list.add(6);
		int minsum=list.get(0)+list.get(1);
		int firstIndex=0;
		int secondIndex=0;
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				int tempSum=list.get(i)+list.get(j);
				if(Math.abs(tempSum)<Math.abs(minsum))
				{
					minsum=tempSum;
					firstIndex=i;
					secondIndex=j;
				}
				
			}
		}
		System.out.println("First number is:"+list.get(firstIndex));
		System.out.println("Second number is: "+list.get(secondIndex));
	}

}
