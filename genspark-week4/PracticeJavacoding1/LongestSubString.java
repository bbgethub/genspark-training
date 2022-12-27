import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestSubString {
    public static void main(String arg[])
    {
        String s1="abbcabdcbb";
//        int n=s1.length();
//        HashSet<Character> set=new HashSet<>();
//        int result=1;
//        int i=0;
//        for(int j=0;j<n;j++)
//        {
//            char ch=s1.charAt(j);
//            if(!set.contains(ch))
//            {
//                set.add(ch);
//                result=Math.max(result, set.size());
//            }
//            else {
//                while(i<j)
//                {
//                    if(s1.charAt(i)==ch)
//                    {
//                        i++;
//                        break;
//                    }
//                    set.remove(s1.charAt(i));
//                    i++;
//                }
//            }
//        }
//        System.out.println("Longest substring: "+result);
        longest("abbcabdcbb");
    }
//abbca
    public static String longest(String s){

        Map<Character,Character> map = new HashMap<Character,Character>();

        StringBuilder longest = new StringBuilder("");
        StringBuilder longest1 = new StringBuilder("");
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (isPresent(map,ch)){
                map = new HashMap<Character,Character>();
                map.put(ch,ch);
                if (longest1.length() < longest.length()){
                    longest1 = longest;
                }
               // longest1= longest;
                longest = new StringBuilder("").append(ch);
            }else{
                longest.append(ch);
                map.put(ch,ch);
            }
        }
        if (longest1.length() < longest.length()){
            longest1 = longest;
        }
        System.out.println(longest1);
        return "";
    }

    public static boolean isPresent(Map<Character,Character> map , Character c){
        List<Character> list=  map.keySet().stream().filter(x -> x.equals(c)).peek(System.out::println).collect(Collectors.toList());
        return  list.size()>0;
    }

}
