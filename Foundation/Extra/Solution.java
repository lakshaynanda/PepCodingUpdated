import java.io.*;
import java.util.*;

public class Solution {
    public static Scanner sc=new Scanner(System.in);
    public static void putval(int[][] m1)
    {
        for(int i=0;i<m1.length;i++)
        {
            for(int j=0;j<m1[0].length;j++)
            {
                m1[i][j]=sc.nextInt();
            }System.out.println();
        }
    }
    public static void addmat(int[][] m1,int[][] m2)
    {
        for(int i=0;i<m1.length;i++)
        {
            for(int j=0;j<m1[0].length;j++)
            {
                m1[i][j]+=m2[i][j];
            }
        }
    }
    public static void trace(int[][] m1)
    {
        int sum=0;
        for(int i=0;i<m1.length;i++)
        {
            for(int j=0;j<m1[0].length;j++)
            {
                if(i==j)
                {
                    sum+=m1[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] m1=new int[n][m];
        int[][] m2=new int[n][m];
        putval(m1);
        putval(m2);
        addmat(m1,m2);
        trace(m1);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}