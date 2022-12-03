
public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1="javas";
		String string2="ajava";
		int length1=string1.length();
		if(length1!=string2.length())
			System.out.println("Not Anagram");
		else
		{
			for(int i=0;i<length1;i++)
			{
				char ch=string1.charAt(i);
				int index=string2.indexOf(ch);
				if (index!=-1)
					string2=string2.substring(0, index)+string2.substring(index+1, string2.length());
					System.out.println(string2);
			}
			if(string2.isEmpty())
				System.out.println("Its an Anagram");
			else 
				System.out.println("Its not an Anagram"+string2);
		}

	}

}
