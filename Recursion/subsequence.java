import java.util.*;
public class subsequence
{
    public static ArrayList<String> subs(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> baseres=new ArrayList<String>();
            baseres.add(".");
            return baseres;
        }
        String roq=str.substring(1);
        char ch=str.charAt(0);

        ArrayList<String> myAns=new ArrayList<String>();
        ArrayList<String> recAns=subs(roq);

        for(String strin:recAns)
        {
            myAns.add(strin);
            myAns.add(ch+strin);
        }
        return myAns;
    }
    public static ArrayList<String> subswithASCII(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> baseres=new ArrayList<String>();
            baseres.add(".");
            return baseres;
        }
        String roq=str.substring(1);
        char ch=str.charAt(0);

        ArrayList<String> myAns=new ArrayList<String>();
        ArrayList<String> recAns=subswithASCII(roq);

        for(String strin:recAns)
        {
            myAns.add(strin);
            myAns.add(ch+strin);
            myAns.add((int)ch+strin);
        }
        return myAns;
    }
    public static void printSubSequence(String ques, String asf)
    {
        if(ques.length()==0)
        {
            System.out.println(asf);
            return;
        }
        char ch=ques.charAt(0);
        String roq=ques.substring(1);
        printSubSequence(roq, asf);
        printSubSequence(roq, asf+ch);
    }
    public static void main(String args[])
    {
        // String str="ab";
        // System.out.print(subswithASCII(str));
        String ques="abc";
        printSubSequence(ques,"");
    }
}