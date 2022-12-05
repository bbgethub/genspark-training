import java.util.HashSet;

public class AllCharUnique {
	
	//To check if String has all unique characters in java

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1="abcdagc";
		String string2="dagab";
		int[] num= {1,2,4,5,6};
		System.out.println("String has all unique character "+checkMethod1(string1));
		System.out.println("String has all unique character "+checkWithHashSet(string1));
		System.out.println("String1 and String 2 are rotation: "+checkRotation(string1,string2));
		findDoublicateChar(string1);
		findNonRepeatedChar("abcadef");
		findAllSubString("abb");
		findLengthOfString("welcome");
		secondLargestNum(num);
		smallLargeNum(num);
		missingNumber(num);

	}
	
	//To check if String has all unique characters by method1
	public static boolean checkMethod1(String string1)
	{
		for(int i=0;i<string1.length();i++)
		{
			char ch=string1.charAt(i);
			if(string1.indexOf(ch)!=string1.lastIndexOf(ch))
				return false;
		}
		
		return true;
	}
	//To check if String has all unique characters by method2
	public static boolean checkWithHashSet(String string1)
	{
		HashSet string2=new HashSet();
		for(int i=0;i<string1.length();i++)
		{
			char ch=string1.charAt(i);
			if(!string2.add(ch))
				return false;
		}
		return true;
	}
	
	// to check if one String is rotation of another String
	public static boolean checkRotation(String string1,String string2)
	{
		String string3=string1+string1;
		if(string3.contains(string2))
			return true;
		else
			return false;
					
	}

	//To find duplicate characters in String in java
	public static void findDoublicateChar(String string1)
	{
		char ch[]=string1.toCharArray();
		System.out.println("Duplicate chars: ");
		for(int i=0;i<string1.length();i++)
			for(int j=i+1;j<string1.length();j++)
				if(ch[i]==ch[j])
				{
					System.out.println(ch[i]);
					break;
				}
	}
	
	//Find first non repeated character in String
	public static void findNonRepeatedChar(String string1)
	{
		for(int i=0;i<string1.length();i++)
		{
			char ch=string1.charAt(i);
			if(string1.indexOf(ch)==string1.lastIndexOf(ch))
			{
				System.out.println("First nonRepeated Character: "+ch);
				break;
			}
			
		}
	}
	
	// Find all substrings of String
	
	public static void findAllSubString(String string1)
	{
		for(int i=0;i<string1.length();i++)
		{
			for(int j=i+1;j<=string1.length();j++)
				System.out.println(string1.substring(i, j));
		}
	}
	
	//Find length of String without using any inbuilt method
	public static void findLengthOfString(String string1)
	{
		char ch[]=string1.toCharArray();
		int length=0;
		for(char c:ch)
			length++;
		System.out.println("String length"+length);
	}
	
	//Find Second Largest number
	
	public static void secondLargestNum(int[] num)
	{
		int temp;
		int length=num.length;
		for(int i=1;i<length;i++)
			for(int j=i+1;j<length;j++)
			{
				if(num[i]>num[j])
				{
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;
				}
			}
		System.out.println("Second Largest number: "+num[length-2]);
				
	}
	
	//Find Smallest and Largest Number in an array
	public static void smallLargeNum(int[] arr) {
		int temp;
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]>arr[j])
				{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=arr[i];
				}
		System.out.println("Smallest number: "+arr[0]);
		System.out.println("Largest number: "+arr[arr.length-1]);
	}
	
	public static void missingNumber(int[] num)
	{
		int len=num.length+1;
		int sum=len*(len+1)/2;
		int total=0;
		for(int i=0;i<num.length;i++)
		{
			total+=num[i];
		}
		System.out.println("Sum :"+sum);
		System.out.println("Total of Array:"+total);
		int missingNum=sum-total;
		System.out.println("Missing number is: " + missingNum);
	}
}
