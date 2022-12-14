import java.util.HashSet;

public class LongestSubString {
    public static void main(String arg[])
    {
        String s1="abbcabdcbb";
        int n=s1.length();
        HashSet<Character> set=new HashSet<>();
        int result=1;
        int i=0;
        for(int j=0;j<n;j++)
        {
            char ch=s1.charAt(j);
            if(!set.contains(ch))
            {
                set.add(ch);
                result=Math.max(result, set.size());
            }
            else {
                while(i<j)
                {
                    if(s1.charAt(i)==ch)
                    {
                        i++;
                        break;
                    }
                    set.remove(s1.charAt(i));
                    i++;
                }
            }
        }
        System.out.println("Longest substring: "+result);
    }
}
