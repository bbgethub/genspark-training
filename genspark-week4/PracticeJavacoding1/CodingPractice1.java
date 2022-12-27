import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class CodingPractice1 {
    public static void main(String args[])
    {
        String s1="ABC";
        int end=s1.length();
        findPermu(s1,0,end);
    }

    public static void findPermu(String s1,int start,int end)
    {
        if(start==end-1)
            System.out.println(s1);
        else {
            for(int i=0;i<end;i++)
            {
                s1=swap(s1,start,i);
                findPermu(s1,start+1,end);
                s1=swap(s1,start,i);
            }
        }
    }

    public static String swap(String s1,int i,int j)
    {
        char ch[]=s1.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return String.valueOf(ch);
    }
}
