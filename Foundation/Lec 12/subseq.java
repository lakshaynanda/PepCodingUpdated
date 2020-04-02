import java.util.*;
public class subseq
{
    public static void subsequence(String s,String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(0);
        String roq=s.substring(1);
        subsequence(roq,ans+ch);
        subsequence(roq,ans);
    }
    // public static ArrayList <String> al=new ArrayList<String>();
    public static void main(String args[])
    {
        String s = "abcd";
        subsequence(s,"");
        //System.out.println(al);
    }
}