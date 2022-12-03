import java.util.HashSet;

public class AllCharUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1="abcdagc";
		String string2="dagab";
		int[] num= {30,20,47,50,25,10};
		System.out.println("String has all unique character "+checkMethod1(string1));
		System.out.println("String has all unique character "+checkWithHashSet(string1));
		System.out.println("String1 and String 2 are rotation: "+checkRotation(string1,string2));
		findDoublicateChar(string1);
		findNonRepeatedChar("abcadef");
		findAllSubString("abb");
		findLengthOfString("welcome");
		secondLargestNum(num);

	}
	
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
	
	public static boolean checkRotation(String string1,String string2)
	{
		String string3=string1+string1;
		if(string3.contains(string2))
			return true;
		else
			return false;
					
	}

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
	
	public static void findAllSubString(String string1)
	{
		for(int i=0;i<string1.length();i++)
		{
			for(int j=i+1;j<=string1.length();j++)
				System.out.println(string1.substring(i, j));
		}
	}
	public static void findLengthOfString(String string1)
	{
		char ch[]=string1.toCharArray();
		int length=0;
		for(char c:ch)
			length++;
		System.out.println("String length"+length);
	}
	
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
}
