import java.io.*;
import java.util.*;

public class trace2D {
    public static Scanner sc=new Scanner(System.in);
    public static void input(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    public static void add(int arr1[][],int arr2[][])
    {
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++)
            {
                arr1[i][j]+=arr2[i][j];
            }
        }
    }
    public static int trace(int arr1[][])
    {
        int sum=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++)
            {
                if(i==j)
                {
                    sum+=arr1[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr1[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        input(arr1);
        input(arr2);
        add(arr1,arr2);
        System.out.println(trace(arr1));
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}