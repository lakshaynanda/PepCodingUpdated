import java.util.*;
public class sirarrlissubs
{
    public static ArrayList<String> subseq1(String ques)
    {
        if(ques.length()==0)
        {
            ArrayList<String> baseres=new ArrayList<>();
            baseres.add(".");
            return baseres; 
        }
        String roq=ques.substring(1);
        char ch=ques.charAt(0);
        ArrayList<String> recans = subseq1(roq);
        ArrayList<String> myans = new ArrayList<String>();

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
    public static void main(String args[])
    {
        String ques="abc";
        System.out.println(subseq1(ques));
    }
}