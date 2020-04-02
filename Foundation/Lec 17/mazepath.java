import java.util.*;
public class mazepath
{
    public static int dpmaze(int sr,int sc,int er,int ec)
    {
        int [][]dp=new int[er+1][ec+1];
        for(int i=dp.length-1;i>=0;i--)
        {
            for(int j=dp[0].length-1;j>=0;j--)
            {
                if(i==dp.length-1 && j==dp[0].length-1)
                {
                    dp[i][j]=1;
                }
                else if(i==dp.length-1)
                {
                    dp[i][j]=dp[i][j+1];
                }
                else if(j==dp[0].length-1)
                {
                    dp[i][j]=dp[i+1][j];
                }
                else
                {
                    dp[i][j]=dp[i][j+1]+dp[i+1][j];
                }
            }
        }
        return dp[0][0];
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        System.out.println(dpmaze(0,0,3,4));
    }
}