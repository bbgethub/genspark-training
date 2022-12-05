
public class ReverseString {

	// To reverse a String in java
	public static void main(String[] args)
	{
		String name="abcdefg";
		char tempchar[]=name.toCharArray();
		String reverse;
		StringBuffer reverseStr=new StringBuffer();
		
		if(!name.isEmpty())
		{
		for(int i=name.length()-1;i>=0;i--)
		{
			//System.out.print(tempchar[i]);
			reverseStr.append(name.charAt(i));
		}
		System.out.println(name);
		System.out.println("Reverse String: "+reverseStr);
		}
		System.out.println("rev methon"+rev("abc"));
		System.out.println("rev1 methon"+rev1("abc"));
		System.out.println("rev2 methon"+rev2("abc"));
	}
	
	// To reverse a String with StringBuilder
	public static String rev(String s) {
		
		char c[] = s.toCharArray();
		StringBuilder sb= new  StringBuilder();
		for (int i=s.length()-1;i>=0;i--) {
			sb.append(c[i]);
		}
		return sb.toString();
		
	}
	// To reverse a String with out char[] array
	public static String rev1(String s) {		
		//char c[] = s.toCharArray();
		StringBuilder sb= new  StringBuilder();
		for (int i=s.length()-1;i>=0;i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();		
	}
	
	// to reverse a String with Recursion Function
	public static String rev2(String s) {		
		while(s.length()>1)
		return s.substring(s.length()-1)+rev2(s.substring(0,s.length()-1));	
		return s;
	}
	
}
