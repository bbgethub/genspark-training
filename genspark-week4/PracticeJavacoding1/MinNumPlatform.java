import java.util.Arrays;

public class MinNumPlatform {
    public static void main(String args[])
    {
        int arrival[] =new int[] {100, 140, 150, 200, 215, 400};
        int departure[] = new int[]{110, 300, 220, 230, 315, 600};
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int maxNumPlatform=0;
        int neededPlatform=0;
        int i=1,j=0;
            while(i< arrival.length&& j<departure.length)
            {
                if(arrival[i]<departure[j])
                {
                    neededPlatform++;
                    i++;
                    if(maxNumPlatform<neededPlatform)
                        maxNumPlatform=neededPlatform;
                }
                else
                    neededPlatform--;
                j++;
            }
        System.out.println("NeededPlatForm: "+neededPlatform);
    }
}
