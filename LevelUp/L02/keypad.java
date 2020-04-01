import java.util.*;
public class keypad
{
    public static ArrayList<String> kepad(String ques, String[] st)
    {
        if(ques.length()==0)
        {
            ArrayList<String> baseres=new ArrayList<String>();
            baseres.add(".");
            return baseres;
        }
        String roq=ques.substring(1);
        char ch=ques.charAt(0);
        int fn=ch-'0';
        String code=st[fn];
        ArrayList<String> recAns=kepad(roq, st);
        ArrayList<String> myAns=new ArrayList<String>();
        for(int i=0;i<code.length();i++)
        {
            for(String str:recAns)
            {
                myAns.add(code.charAt(i)+str);
            }
        }
        return myAns;
    }
    public static void main(String args[])
    {
        String[] st={"?.",",;","abc","def","ghi","jkl","mno","pqrs","tuvw","xyz"};
        String ques="478";
        ArrayList<String> myans=kepad(ques,st);
        System.out.println(myans);
    }
}