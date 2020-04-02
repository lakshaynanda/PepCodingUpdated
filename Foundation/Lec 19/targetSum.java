import java.util.*;
public class targetSum
{
    public static boolean targetsum(int arr[],int target)
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
    public static ArrayList<Integer> n2rp(node root,int data)
    {
        if(root.data==)
    }
    public static void main(String args[])
    {
        int arr[]={2,1,9,4,5};
        System.out.println(targetsum(arr,7));
    }
}