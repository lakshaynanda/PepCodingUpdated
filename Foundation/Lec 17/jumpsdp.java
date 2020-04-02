import java.util.*;
public class jumpsdp
{
    public static int jumps(int n)
    {
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++)
        {
            int myans=0;
            if(i-1>=0)
            {
                myans+=dp[i-1];
            }
            if(i-2>=0)
            {
                myans+=dp[i-2];
            }
            if(i-3>=0)
            {
                myans+=dp[i-3];
            }
            dp[i]=myans;
        }
        return dp[n];
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int steps=sc.nextInt();
        System.out.println(jumps(steps));
    }
}