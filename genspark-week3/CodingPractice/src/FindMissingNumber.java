import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,6,9,10,11,12,15,19,25));
		Collections.sort(list);
		System.out.println("Missing numbers: "+findMissingNumbers(list));
	}

	//Find the missing integer element in the list
	public static List<Integer> findMissingNumbers(List<Integer> list)
	{
		List<Integer> missingNumber = new ArrayList<Integer>();
		int lastNum = list.get(list.size()-1);
		for (int i=0;i<lastNum;i++) {
			System.out.println(" Number  "+( i+1) + " : "+ isPresent(list,i+1));
			if (!isPresent(list,i+1)) {
				missingNumber.add(( i+1));
			}
		}
		
		return missingNumber;

	}
	
	
//Check whether the integer element is present in the list
	public static boolean isPresent(List<Integer> list, int input) {		
		for (int i=0;i<list.size();i++) {
			//System.out.println(" list.get(i)  "+list.get(i)+ " - " + input);
			if (list.get(i) == input){
				return true;
			}
		}
		return false;
	}
	
	/*
	 * public static int findSum(int n) { return n * (n+1) / 2; }
	 */
}
