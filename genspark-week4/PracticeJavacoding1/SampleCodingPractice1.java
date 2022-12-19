import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SampleCodingPractice1 {
    public static void main(String args[])
    {
        String s1="haris";
        String s2="rishah";
        int[] array1={20,10,1,15,6,9};
        StringBuilder sb=new StringBuilder();
        for(int i=s1.length()-1;i>=0;i--)
        {
            char ch=s1.charAt(i);
            sb.append(ch);
        }
        System.out.println("Reversed String: "+sb);
        System.out.println("are they anagaram: "+checkAnagaram(s1,s2));
        System.out.println("Check all charactors are unique "+checkUniqueChar(s1));
        System.out.println("Check rotation of another string "+checkRotation("java2blog","blogjava2"));
        System.out.println("Find duplicate Characters: "+findDuplicate("haraishi"));
        System.out.println("First non repeated Character: "+firstNonRepeatedChar("haraishi"));
        System.out.println("Find all subString: "+findAllSubString("abb"));
       findSmallLarge(array1);
    }

    public static void findSmallLarge(int[] array)
    {
        for(int i=0;i< array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            if(array[i]>array[j])
            {
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }

        }
        System.out.println("Smallest number is:"+array[0]);
        System.out.println("Largest number is:"+array[array.length-1]);
    }
    public static boolean checkAnagaram(String s1, String s2) {
        int l = s1.length();
        if (s1.length() != s2.length()) {
            return false;
        } else {
            for (int i = 0; i < l; i++) {
                char ch = s1.charAt(i);
                int index = s2.indexOf(ch);
                if (index != -1)
                    s2 = s2.substring(0, index) + s2.substring(index + 1, s2.length());
                else
                    return false;

            }

            return s2.isEmpty();
        }
    }

    public static boolean checkUniqueChar(String s1)
    {
        //Set<Character> set=new HashSet<>();
        boolean result=true;
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(s1.indexOf(ch)==s1.lastIndexOf(ch))
               result= true;
            else
                result=false;

        }
        return result;
    }

    public static boolean checkRotation(String s1,String s2)
    {
        String s3=s1+s1;
        if(s3.contains(s2))
            return true;
        else
            return false;
    }

    public static int findDuplicate(String s)
    {
        HashSet<Character> set=new HashSet<>();
        List<Character> list= new ArrayList<Character>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!set.add(ch))
                list.add(ch);
        }
        return list.size();
    }
    
    public static char firstNonRepeatedChar(String s)
    {
        char ch = 0;
        Set<Character> set=new HashSet<Character>();
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(s.indexOf(ch)==s.lastIndexOf(ch))
                return ch;
        }
        return ch;
    }

    public static List<String> findAllSubString(String s)
    {
        List<String> list=new ArrayList<String>();
        for(int i=0;i<s.length();i++)
            for(int j=i+1;j<=s.length();j++)
            {
                list.add(s.substring(i,j));
            }
        return list;
    }
}
