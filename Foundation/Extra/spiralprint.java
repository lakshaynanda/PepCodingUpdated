import java.io.*;
import java.util.*;

public class spiralprint{
    public static Scanner sc=new Scanner(System.in);
    public static void add(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    
    public static void spiralPrint(int[][] arr)
    {
        int count=0;
        int minr=0;
        int maxr=arr.length-1;
        int minc=0;
        int maxc=arr[0].length-1;
        
        while(count< arr.length*arr[0].length)
        { 
            for(int i=minr;i<=maxr;i++)
            {
                System.out.print(arr[i][minc]+" ");
                count++;
            }
            minc++;
            
            for(int i=minc;i<=maxc;i++)
            {
                System.out.print(arr[maxr][i]+" ");
                count++;

            }
            maxr--;
            if(minc<maxc){
            for(int i=maxr;i>=minr;i--)
            {
                System.out.print(arr[i][maxc]+" ");
                count++;
            }
            maxc--;
}

if(minr<maxr){
            
            for(int i=maxc;i>=minc;i--)
            {
                System.out.print(arr[minr][i]+" ");
                count++;
            }
            minr++;
}
        }
    }
    public static void spiralPrint2(int n,int m, int[][] arr)
    {
        int count=0;
        int minr=0;
        int maxr=arr.length-1;
        int minc=0;
        int maxc=arr[0].length-1;
        int total=m*n;
        while(count< arr.length*arr[0].length)
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
            for(int i=minr;i<=maxr;i++)
            {
                System.out.print(arr[i][maxc]+" ");
                count++;

            }
            maxc--;
            if (count == total) 
                break;
            for(int i=maxc;i>=minc;i--)
            {
                System.out.print(arr[maxr][i]+" ");
                count++;
            }
            maxr--;
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
        
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        add(arr);
        spiralPrint2(n,m,arr);
        System.out.println();
        spiralPrint(arr);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}