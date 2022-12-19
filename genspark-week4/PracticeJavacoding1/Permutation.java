public class Permutation {
    public static void main(String args[])
    {
        String s1="ABC";
        int l=s1.length();
        findPermutation(s1,0,l);
    }

    public static void  findPermutation(String s1, int start, int end)
    {
        if(start==end-1)
            System.out.println(s1);
        else
        {
            for(int i=0;i<end;i++) {
                s1 = swapChar(s1, start, i);
                findPermutation(s1, start + 1, end);
                s1 = swapChar(s1, start, i);
            }
        }
    }

    public static String swapChar(String s1,int i,int j)
    {
        char ch[]=s1.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return String.valueOf(ch);
    }
}
