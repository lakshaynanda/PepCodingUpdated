import java.util.*;
public class fibo {
    public static int Fibo(int n)
    {
        if(n==0 ||n==1)
        {
            return n;
        }
        int fm1=Fibo(n-1);
        int fm2=Fibo(n-2);
        int ans=fm1+fm2;

        return ans;
    }
    public static int FiboMem(int n,int[] dp)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        int fm1=FiboMem(n-1,dp);
        int fm2=FiboMem(n-2,dp);
        int fm=fm1+fm2;

        dp[n]=fm;

        return fm;
    }
    public static void main(String args[])
    {
        int n=10;
        int dp[]=new int[n+1];
        System.out.println(FiboMem(n,dp));
    }

}