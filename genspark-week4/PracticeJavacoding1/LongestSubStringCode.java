import java.util.HashMap;

public class LongestSubStringCode {
    public static void main(String args[])
    {
        System.out.println("Longest Sub String is: "+findLongSub("CODINGISAWESOME"));
    }

    public static String findLongSub(String str)
    {
        String result="";
        HashMap<Character,Integer> map=new HashMap<>();
        int start,end;
        for(start=0,end=0;end<str.length();end++)
        {
            char ch=str.charAt(end);
            if(map.containsKey(ch)){
                start=Math.max(map.get(ch)+1,start);
            }
            if(result.length()<end-start+1)
            {
                result=str.substring(start,end+1);
            }
            map.put(ch,end);
        }
        System.out.println("Map:"+map);
        return result;
    }
}
