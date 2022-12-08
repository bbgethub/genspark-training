import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumbersInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,6,9,10,11,12,15));
		
		System.out.println("Missing numbers: "+findMissingNumbers(list));
	}

	public static List findMissingNumbers(List list)
	{
		List<Integer> result=new ArrayList<>();
		for(int i=0,j=1;j<=list.size();i++,j++)
		{
			int temp=(int) list.get(i);
			if(temp!=j)
			{
				System.out.println("Temp: "+temp);
				System.out.println("i: "+i);
				for(int k=i;k<temp-1;k++)
				{
					int temp1=k+1;
					System.out.println("missing numbers:"+temp1);
					result.add(k+1);
				}
					
			}
		}
		return result;
	}
}
