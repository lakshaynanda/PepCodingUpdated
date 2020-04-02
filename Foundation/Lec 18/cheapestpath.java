import java.util.*;
public class cheapestpath
{
    public static int costpath(int arr[][])
    {
        int dp[][]=new int[arr.length][arr[0].length];
        
        for(int i=dp.length-1;i>=0;i--)
        {
            for(int j=dp[0].length-1;j>=0;j--)
            {
                if(i == dp.length-1 && j == dp[0].length-1){
                    dp[i][j] = arr[i][j];
                }
                else if(i==dp.length-1)
                {
                    dp[i][j]=arr[i][j]+d p[i][j+1];
                }
                else if(j==arr[0].length-1)
                {
                    dp[i][j]=arr[i][j]+dp[i+1][j];
                }
                else{
                    if(dp[i+1][j]<dp[i][j+1])
                    {
                        dp[i][j]=dp[i+1][j]+arr[i][j];
                    }
                    else
                    {
                        dp[i][j]=dp[i][j+1]+arr[i][j];
                    }
                }
            }
        }

        return dp[0][0];
    }
    public static void main(String args[])
    {
        int [][] arr ={{2,0,1,3,1},{1,4,6,2,5},{1,1,2,6,9},{4,5,3,8,2},{3,2,1,1,7},{5,4,9,2,3}};
        System.out.println(costpath(arr));
    }
}