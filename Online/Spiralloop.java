import java.io.*;
import java.util.*;

public class Spiralloop {
    public static void spiralPrint(int arr[][])
    {
        int sr=0;
        int er=arr.length-1;
        int sc=0;
        int ec=arr[0].length-1;
        int total=arr.length*arr[0].length;
        int count=0;
        while(count<arr.length*arr[0].length)
        {
            if (count == total) 
                break;
            for(int i=sc;i<=ec;i++)
            {
                System.out.print(arr[sr][i]+" ");
                count++;
            }
            sr++;
            if (count == total) 
                break;
            for(int i=sr;i<=er;i++)
            {
                System.out.print(arr[i][ec]+" ");
                count++;
            }
            ec--;
            if (count == total) 
                break;
            for(int i=ec;i>=sc;i--)
            {
                System.out.print(arr[er][i]+" ");
                count++;
            }
            er--;
            if (count == total) 
                break;
            for(int i=er;i>=sr;i--)
            {
                System.out.print(arr[i][sc]+" ");
                count++;
            }
            sc++;
        }
    }
    public static void spiralPrintCol(int arr[][])
    {
        int sr=0;
        int er=arr.length-1;
        int sc=0;
        int ec=arr[0].length-1;
        int total=arr.length*arr[0].length;
        int count=0;
        while(count<arr.length*arr[0].length)
        {
            if (count == total) 
                break;
            for(int i=sr;i<=er;i++)
            {
                System.out.print(arr[i][sc]+" ");
                count++;
            }
            sc++;
            if (count == total) 
                break;
            for(int i=sc;i<=ec;i++)
            {
                System.out.print(arr[er][i]+" ");
                count++;
            }
            er--;
            if (count == total) 
                break;
            for(int i=er;i>=sr;i--)
            {
                System.out.print(arr[i][ec]+" ");
                count++;
            }
            ec--;
            if (count == total) 
                break;
            for(int i=ec;i>=sc;i--)
            {
                System.out.print(arr[sr][i]+" ");
                count++;
            }
            sr++;
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
        spiralPrint(arr);
        System.out.println();
        spiralPrintCol(arr);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}