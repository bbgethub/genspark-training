
public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}
