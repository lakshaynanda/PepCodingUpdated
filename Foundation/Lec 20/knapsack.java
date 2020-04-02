import java.util.*;
public class knapsack
{
    public static int knapsack_01(int cost[],int wt[],int cap)
    {
        int[][] dp=new int[cost.length+1][cap+1];
        for(int i=1;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=dp[i-1][j];
                if(j-wt[i-1]>=0)
                {
                    if(dp[i][j]<(cost[i-1]+dp[i-1][j-wt[i-1]]))
                    {
                        dp[i][j]=cost[i-1]+dp[i-1][j-wt[i-1]];
                    }
                }
            }
        }
        return dp[cost.length][cap];
    }
    public static void main(String args[])
    {
        int wt[]={3,4,1,2,5};
        int cost[]={45,20,15,25,30};
        int cap=7;
        System.out.println(knapsack_01(cost, wt, cap));
    }
}