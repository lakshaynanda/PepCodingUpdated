import java.util.*;
public class Subsequence
{
    public static ArrayList<String> subseq(String ques) //return type
    {
        if(ques.length()==0)
        {
            ArrayList<String> baseres=new ArrayList<>();
            baseres.add(".");
            return baseres;
        }
        String roq=ques.substring(1);
        char ch=ques.charAt(0);
        ArrayList<String> recans=subseq(roq);
        ArrayList<String> myans=new ArrayList<>();
        for(String str:recans)
        {
            myans.add(ch+str);
        }
        for(String str:recans)
        {
            myans.add(str);
        }
        return myans;
    }
    public static void subsequence(String ques, String ans) //void Method
    {
        if(ques.length()==0)
        {
            System.out.print(ans+" ");
            return;
        }
        String roq=ques.substring(1);
        char ch=ques.charAt(0);
        subsequence(roq, ans+ch);
        subsequence(roq, ans);
    }
    public static void main(String args[])
    {
        String ques="abcd";
        // System.out.println(subseq(ques));
        subsequence(ques,"");
    }
}