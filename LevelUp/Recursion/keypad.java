import java.util.*;
public class keypad 
{
    public static ArrayList<String> kepad(String str,String[] st)
    {
        if(str.length()==0)
        {
            ArrayList<String> baseRes=new ArrayList<>();
            baseRes.add(".");
            return baseRes;
        }
        char ch=str.charAt(0);
        String roq=str.substring(1);
        int f=ch-'0';
        String code=st[f];
        ArrayList<String> myAns=new ArrayList<>();
        ArrayList<String> recAns=kepad(roq, st);
        for(int i=0;i<code.length();i++)
        {
            for(String s:recAns)
            {
                myAns.add(code.charAt(i)+s);
            }
        }
        return myAns;
    }
    
    public static void main(String args[])
    {
        String str="478";
        String[] st={"?.",",;","abc","def","ghi","jkl","mno","pqrs","tuvw","xyz"};
        System.out.print(kepad(str, st));
    }
}