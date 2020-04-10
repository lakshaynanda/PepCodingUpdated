import java.io.*;
import java.util.*;

public class Solution {
    public static void rowPrint(int arr[][])
    {
        int count=0;
        int minr=0;
        int maxr=arr.length-1;
        int minc=0;
        int maxc=arr[0].length-1;
        int total=arr.length*arr[0].length;
        while(count<arr.length*arr[0].length)
        {
            if (count == total) 
                break;
            for(int i=minc;i<=maxc;i++)
            {
                System.out.print(arr[minr][i]+" ");
                count++;
            }
            minr++;
            if (count == total) 
                break;
            for(int i=maxc;i>=minc;i--)
            {
                System.out.print(arr[minr][i]+" ");
                count++;
            }
            minr++;
        }
    }
    public static void columnPrint(int arr[][])
    {
        int count=0;
        int minr=0;
        int maxr=arr.length-1;
        int minc=0;
        int maxc=arr[0].length-1;
        int total=arr.length*arr[0].length;
        while(count<arr.length*arr[0].length)
        {
            if (count == total) 
                break;
            for(int i=minr;i<=maxr;i++)
            {
                System.out.print(arr[i][minc]+" ");
                count++;
            }
            minc++;
            if (count == total) 
                break;
            for(int i=maxr;i>=minr;i--)
            {
                System.out.print(arr[i][minc]+" ");
                count++;
            }
            minc++;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        rowPrint(arr);
        System.out.println();
        columnPrint(arr);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}