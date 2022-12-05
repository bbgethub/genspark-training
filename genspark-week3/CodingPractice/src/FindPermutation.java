import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FindPermutation {

	public static void main(String[] args) {
		String string1="ABC";
	//	List<List<String>> list=new ArrayList<>();
		int[] arr= {10,20,30};
	//	list.add(Arrays.asList("AAA","BBB","CCC"));
	//	list.add(Arrays.asList("DDD","EEE","FFF"));
		permutaion(string1," ");
		System.out.println("Permutaion of List of Integers");
		for(List<Integer> p:permu(arr))
		{
			System.out.println(p);
		}

	}

	public static void permutaion(String string1, String result )
	{
		
		if(string1.length()==0)
		{
			System.out.println(result+" ");
			return;
		}
		for(int i=0;i<string1.length();i++)
		{
			char ch=string1.charAt(i);
			String string2=string1.substring(0,i)+string1.substring(i+1);
			permutaion(string2,result+ch);
		}
	}
	
	public static List<List<Integer>> permu(int[] arr)
	{
		List<List<Integer>> list=new ArrayList<>();
		permutaionHelper(list,new ArrayList<>(),arr);
		return list;
	}
	
	public static void permutaionHelper(List<List<Integer>> list,List<Integer> resultList,int arr[])
	{
		if(resultList.size()==arr.length)
		{
			list.add(new ArrayList<>(resultList));
		}
		else {
			for(int i=0;i<arr.length;i++)
			{
				if(resultList.contains(arr[i]))
				{
					continue;
				}
				resultList.add(arr[i]);
				permutaionHelper(list,resultList,arr);
				resultList.remove(resultList.size()-1);
			}
		}
	}
}
