import java.util.*;

public class string
{
    public static void print(String str, int i,int j)
    {
        for(int id=i;id<=j;id++)
        {
            System.out.print(str.charAt(id)+" ");
        }System.out.println();
    }
    public static void subst(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                print(str,i,j);
            }
        }
    }
    public static boolean palin(String str1)
    {
        boolean isPalin=true;
        for(int i=0;i<str1.length()/2;i++)
        {
            if(str1.charAt(i)!=str1.charAt(str1.length()-1-i))
            {
                isPalin=false;
                break;
            }
        }
        return isPalin;
        

        
    }
    public static void main(String args[])
    {
        String str1=new String("abc");
        
        System.out.println(palin(str1));
        // subst(str);    //Alternate
        // for(int i=0;i<str.length();i++)
        // {
        //     for(int j=i+1;j<=str.length();j++)
        //     {
        //         System.out.print(str.substring(i,j)+" ");
        //     }
        // }

    }
}