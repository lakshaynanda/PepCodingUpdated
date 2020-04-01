import java.util.*;

public class toh
{
    public static void tower(String src,String dest, String helper,int n)
    {
        if(n==0)
        {
            return;
        }
        tower(src, helper, dest, n-1);
        System.out.println("Move "+ n+"th disc from "+src+" to "+dest);
        tower(helper, dest, src, n-1);

    }
    public static void main(String args[])
    {
        String src="A"; String dest="B"; String helper="C";
        int n=3;
        tower(src,dest,helper,n);
    }
}