import java.util.*;
public class goldmine
{
    public static int mymax(int... vals)
    {
        int max=vals[0];
        for(int i=1;i<vals.length;i++)
        {
            if(vals[i]>max)
            {
                max=vals[i];
            }
        }
        return max;
    }
    public static String gold(int arr[][])
    {
        int dp[][]=new int[arr.length][arr[0].length];
        for(int j=arr[0].length-1;j>=0;j--)
        {
            for(int i=arr.length-1;i>=0;i--)
            {
                if(j==arr[0].length-1)
                {
                    dp[i][j]=arr[i][j];
                }
                else if(i==0)
                {
                    dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],dp[i+1][j+1]);
                }
                else if(i==arr.length-1)
                {
                    dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],dp[i-1][j+1]);
                }
                else{
                    dp[i][j]=arr[i][j]+mymax(dp[i-1][j+1],dp[i+1][j+1],dp[i][j+1]);
                }
            }
        }
        int max=dp[0][0];
        for(int j=0;j<dp.length;j++)
        {
            if(dp[j][0]>max){
                max=dp[j][0];
            }
        }
        return max;
    }
    public static void minCostPath(int dp[][],int i,int j,String path)
    {
        if(i==dp.length-1 && j==dp[0].length-1)
        {
            System.out.println(path);
            return;
        }
        if(i==dp.length-1)
        {
            minCostPath(dp, i, j+1, path+'h');
        }
        else if(j==dp[0].length-1)
        {
            minCostPath(dp, i+1, j, path+'v');
        }
        else
        {
            int min=dp[i][j+1];
            if(min>dp[i+1][j])
            {
                min=dp[i+1][j];
            }
            if(min==dp[i][j+1])
            {
                minCostPath(dp, i, j+1, path+'h');
            }
            if(min==dp[i+1][j])
            {
                minCostPath(dp, i+1, j, path+'v');
            }
        }
    }
    public static boolean targetSum(int arr[],int target)
    {
        boolean [][]dp=new boolean[arr.length+1][target+1];
        dp[0][0]=true;
        for(int i=1;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=dp[i-1][j];
                if(dp[i][j]==false)
                {
                    if(j-arr[i-1]>=0 && dp[i-1][j-arr[i-1]])
                    {
                        dp[i][j]=true;
                    }
                }
            }
        }
        return dp[arr.length][target];
    }
    public static void main(String args[])
    {
        int arr[]={2,1,9,4,5};
        System.out.println(targetSum(arr,7));
    }
}