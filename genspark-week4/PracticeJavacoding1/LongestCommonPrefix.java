import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String args[])
    {
        String[] strArr={"java2blog","javaworld","javbean","javatemp"};
        Arrays.sort(strArr);
        int size=strArr.length;
        int end=Math.min(strArr[0].length(),strArr[size-1].length());
        int i=0;
        while(i<end&&strArr[0].charAt(i)==strArr[size-1].charAt(i))
            i++;
        String substr=strArr[0].substring(0,i);
        System.out.println("Longest Common prefix sub string is: "+substr);
    }
}
