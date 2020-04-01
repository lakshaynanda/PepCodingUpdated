import java.util.*;
public class PermComb
{
    public static ArrayList<String> permutation_withDup_01(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> baseres=new ArrayList<>();
            baseres.add(str);
            return baseres;
        }
        char ch=str.charAt(0);
        ArrayList<String> smallAns=permutation_withDup_01(str.substring(1));
        ArrayList<String> myAns=new ArrayList<String>();
        for(String s:smallAns)
        {
            for(int i=0;i<=s.length();i++)
            {
                myAns.add(s.substring(0,i) + ch + s.substring(i));
            }
        }
        return myAns;
    }
    public static int permutation_withDup_02(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.print(ans+" ");
            return 1;
        }
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            String nstr=str.substring(0,i)+str.substring(i+1);
            count+=permutation_withDup_02(nstr, ans+str.charAt(i));
        }
        return count;
    }
    public static int permutation_withoutDup(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.print(ans+" ");
            return 1;
        }
        int count=0;
        boolean[] visited=new boolean[26];
        
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(!visited[ch-'a'])
            {
                visited[ch-'a']=true;
                String nstr=str.substring(0,i)+str.substring(i+1);
                count+=permutation_withoutDup(nstr, ans+ch);
        
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        String str="aba";
        System.out.print(permutation_withoutDup(str,""));
    }
}