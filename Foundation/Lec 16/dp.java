import java.util.*;
public class dp
{
    public static int fibo(int n, int[] dp) {
        if(n==0 || n==1)
        {
            return n;
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        int nm1=fibo(n-1, dp);
        int nm2=fibo(n-2, dp);
        dp[n]=nm2+nm1;
        return nm1+nm2;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        System.out.println(fibo(n, dp));
    }
}