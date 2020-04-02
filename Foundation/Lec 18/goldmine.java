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
    public static String gold(int arr[][],String psf)
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
        psf=psf+max;
        
        return max;
    }
    public static void main(String args[])
    {
        int arr[][]={
            {4,8,2,7,9,4},
            {3,7,6,4,3,1},
            {5,1,2,3,5,6},
            {4,3,6,8,4,2},
            {1,2,6,4,2,6},
            {2,8,1,9,3,7},
        };
        System.out.println(gold(arr,""));
    }
}