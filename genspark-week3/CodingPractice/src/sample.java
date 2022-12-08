import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> array1=new ArrayList<>();
		array1.add(1);
		array1.add(2);
		array1.add(3);
		array1.add(5);
		List<Integer> array2=new ArrayList<>();
		array2.add(3);
		array2.add(-3);
		array2.add(-10);
//		Collections.sort(array2, Comparator.comparingInt(Math::abs));
//	array2.sort(Comparator.comparingInt(Math::abs));

		System.out.println("Ordered List: "+ sortList(array2));
		int result=orderArray(array1);
		System.out.println("Print Result: "+result);
		String str="Welcomel";
		int flag=0;
		for(int i=0;i<str.length();i++)
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(j)==str.charAt(i))
				{
					System.out.println("First Repeated Char: "+str.charAt(j));
					flag=1;
					break;
				}
				if(flag==1)
					break;
			}
		Fibonacci(7);
		System.out.println("Factorial: "+ factorial(4));
	}
	
	public static int orderArray(List<Integer> arr)
	{
		int result=0;
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i)!=i+1)
			{
				result=i+1;
				return result;
			}
		}
		return result;
		
	}
	
	public static List<Integer> sortList(List<Integer> arr)
	{
		int result[]=new int[arr.size()];
		List<Integer> resultList=new ArrayList<>();
	for(int s=0;s<arr.size();s++)
		{
			System.out.println(arr.get(s));
			result[s]=arr.get(s);
		}
		for(int i=0;i<arr.size();i++)
			for(int j=i;j<arr.size();j++)
				if(result[i]>result[j])
				{
					int temp=result[i];
					result[i]=result[j];
					result[j]=temp;
				}
		for(int i=0;i<arr.size();i++)
			resultList.add(result[i]);
		return resultList;
	}
	
	public static void Fibonacci(int n)
	{
		int j=0,k=1,sum=0;
		System.out.print(j+" ");
		for(int i=1;i<n;i++)
		{
			System.out.print(sum+" ");
			sum=j+k;
			k=j;
			j=sum;
			
			
		}
	}
	
	public static long factorial(int n)
	{
		if(n>=1)
			return n*factorial(n-1);
		else
			return 1;
		
	}
	

}
