import java.util.*;
public class matrixMult 
{ 
	static int MatrixChainOrder(int p[], int n) 
	{ 
		int m[][] = new int[n][n]; 
		for (int i = 1; i < n; i++) 
			m[i][i] = 0; 
		for (int L=2; L<n; L++) 
		{ 
			for (int i=1; i<n-L+1; i++) 
			{ 
				int j = i+L-1; 
				if(j == n) continue; 
				m[i][j] = Integer.MAX_VALUE; 
				for (int k=i; k<=j-1; k++) 
				{
					int min = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j]; 
					if (min < m[i][j]) 
						m[i][j] = min; 
				} 
			} 
		}
		return m[1][n-1]; 
    } 
    public static int mcm(int []arr)
    {
        int dp[][]=new int[arr.length-1][arr.length-1];
        for(int gap=0;gap<dp[0].length;gap++)
        {
            for(int i=0,j=i+gap;j<dp[0].length;i++,j++)
            {
                if(gap==0)
                {
                    dp[i][j]=0;
                }
                else if(gap==1)
                {
                    dp[i][j]=arr[i]*arr[j+1]*arr[j];
                }
                else
                {
                    dp[i][j]=Integer.MAX_VALUE;
                    for(int k=0;k<gap;k++)
                    {
                        int lp=dp[i][i+k];
                        int rp=dp[i+1+k][j];
                        int multCost=arr[i]*arr[j+1]*arr[i+1+k];
                        dp[i][j]=Math.min(dp[i][j],lp+rp+multCost);
                    }
                }

            }
        }
        return dp[0][dp[0].length-1];
    }

	public static void main(String args[]) 
	{ 
		int arr[] = new int[] {10,20,30,40,50,60}; 
		// int size = arr.length; 

		System.out.println(mcm(arr)); 
	} 
}
