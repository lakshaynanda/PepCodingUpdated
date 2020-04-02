import java.util.*;

public class targetsum
{
    public static int targetsumperm(int arr[],int target)
    {
        int dp[]=new int[target+1];
        dp[0]=1;
        for(int i=1;i<dp.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i-arr[j]>=0)
                {
                    dp[i]+=dp[i-arr[j]];
                }
                
            }
        }
        return dp[target];
    }
    public static int targetsumcomb(int arr[],int target)
    {
        int dp[]=new int[target+1];
        dp[0]=1;
        for(int j=0;j<arr.length;j++)
        {
            for(int i=1;i<dp.length;i++)
            {
                if(i-arr[j]>=0)
                {
                    dp[i]+=dp[i-arr[j]];
                }
                
            }
        }
        return dp[target];
    }
    public static void main(String args[])
    {
        int arr[]={2,3,5};
        int target=7;
        System.out.println(" ");
        System.out.println("Permuatation: ");
        System.out.println(targetsumperm(arr,target));
        System.out.println("Combination: ");
        System.out.println(targetsumcomb(arr,target));
    }
}