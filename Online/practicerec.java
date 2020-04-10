import java.util.*;
public class practicerec
{
    public static void subString(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<=s.length();j++)
            {
                String str=s.substring(i,j);
                System.out.print(str+" ");
            }
        }
    }
    public static boolean isPalin(String s)
    {
        boolean isTrue=true;
        for(int i=0;i<=s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                isTrue=false;
                break;
            }
        }
        return isTrue;
    }
    public static ArrayList<String> subsequence(String s)
    {
        if(s.length()==0)
        {
            ArrayList<String> baseres=new ArrayList<>();

            baseres.add(".");
            return baseres;
        }
        String roq=s.substring(1);
        char ch=s.charAt(0);
        ArrayList<String> recans=subsequence(roq);
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
        // subsequence(roq,ans);
        
    }
    public static ArrayList<String> paths(int n)
    {
        if(n==0)
        {
            ArrayList<String> baseres=new ArrayList<>();
            baseres.add("");
            return baseres;
        }
        ArrayList<String> myans=new ArrayList<>();
        if(n-1>=0)
        {
            ArrayList<String> recans=paths(n-1);
            for(String str:recans)
            {
                myans.add("1"+str);
            }
        }
        if(n-2>=0)
        {
            ArrayList<String> recans=paths(n-2);
            for(String str:recans)
            {
                myans.add("2"+str);
            }
        }
        if(n-3>=0)
        {
            ArrayList<String> recans=paths(n-3);
            for(String str:recans)
            {
                myans.add("3"+str);
            }
        }
        return myans;
    }
    public static void main(String args[])
    {
        int n=7;
        System.out.println(paths(n));
        //String s = "abcd";
        //subsequence(s,"");
        //System.out.println(subsequence(s));
        // System.out.println(isPalin("naman"));
        //subString("abcd");
    }
}