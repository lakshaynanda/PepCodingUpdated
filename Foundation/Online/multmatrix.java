import java.io.*;
import java.util.*;

public class multmatrix {
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
    public static void mult(int arr1[][],int arr2[][],int arr3[][])
    {
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2[0].length;j++)
            {
                for(int k=0;k<arr2.length;k++)
                arr3[i][j]+=arr1[i][k]*arr2[k][j];
            }
        }
        for(int i=0;i<arr3.length;i++)
        {
            for(int j=0;j<arr3[0].length;j++)
            {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    

    public static void main(String[] args) {
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr1[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        input(arr1);
        input(arr2);
        int arr3[][]=new int[r][c];
        mult(arr1,arr2,arr3);
        
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}