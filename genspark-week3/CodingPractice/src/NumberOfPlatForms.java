import java.util.Arrays;

public class NumberOfPlatForms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrival= {100,140,150,200,215,400};
		int[] depatch= {110,300,210,230,315,600};
		minNumOfPlatform(arrival,depatch);
	}

	public static void minNumOfPlatform(int[] arrival,int[] depatch)
	{
		Arrays.sort(arrival);
		Arrays.sort(depatch);
		int needPlatform=0,maxNeedPlatform=0,i=0,j=0;
		while(i<arrival.length&&j<arrival.length)
          {
				if(arrival[i]<depatch[j])
				{
					needPlatform++;
					i++;
					if(needPlatform>maxNeedPlatform)
						maxNeedPlatform=needPlatform;
				}
				else
				{
					needPlatform--;
					j++;
				}
				
          }
		System.out.println("Minimum Needed Platform: "+maxNeedPlatform);
	}
}
