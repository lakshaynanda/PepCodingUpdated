import java.util.*;

public class jumpsMem
{       
    public static int jumping(int steps)
    {
        int dp[]=new int[steps+1];
        if(steps==0)
        {
            return 1;
        }
        if(dp[steps]!=0)
        {
            return dp[steps];
        }
        int myans=0;
        if(steps-1>=0)
        {
            myans+=jumping(steps-1);
        }
        if(steps-2>=0)
        {
            myans+=jumping(steps-2);
        }
        if(steps-3>=0)
        {
            myans+=jumping(steps-3);
        }
        dp[steps]=myans;
        return myans;
    }    
    public static void main(String args[])
    {
        int n=7;
        System.out.println(jumping(n));
        
    }
}