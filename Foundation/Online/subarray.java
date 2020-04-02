import java.io.*;
import java.util.*;

public class subarray{
public static void print(int[] arr,int i,int j)
{
    for(int id=i;id<=j;id++)
    {
        System.out.print(arr[id]+"\t");
    }System.out.println();
}
public static void findSubArray(int[] arr)
{
    for(int i=0;i<arr.length;i++)
    {
        for(int j=i;j<arr.length;j++)
        {
            print(arr,i,j);
        }
    }
}

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    findSubArray(arr);
 }

}