import java.util.*;
public class countMP {
    static int count=0;
    public static void cmp(int sr,int sc,int dr,int dc,String psf)
    {
        if(sr==dr && sc==dc)
        {
            count++;
            System.out.println(count+". "+psf);
            return;
        }
        if(sr>dr || sc>dc)
        {
            return;
        }
        cmp(sr+1, sc, dr, dc, psf+"V");
        cmp(sr, sc+1, dr, dc, psf+"H");
    }
    public static int cmpMem(int sr,int sc,int dr,int dc,int[][] dp,String psf)
    {
        if(sr==dr && sc==dc)
        {
            count++;
            System.out.println(count+". "+psf);
            return 1;
        }
        if(sc>dc || sr>dr)
        {
            return 0;
        }
        if(dp[sr][sc]!=0)
        {
            return dp[sr][sc];
        }
        int sum=0;
        int x=cmpMem(sr+1, sc, dr, dc, dp,psf+"V");
        int y=cmpMem(sr, sc+1, dr, dc, dp,psf+"H");
        sum=x+y;
        dp[sr][sc]=sum;

        return sum;

    }
    public static void main(String args[])
    {
        int dp[][]=new int[16][16];
        System.out.print(cmpMem(0, 0, 15, 15, dp,""));
    }

}