import java.io.*;
import java.util.*;

public class inversearr {
    public static void inversearr(int arr[],int ar[])
    {
        int num=0;
        for(int i=0;i<arr.length;i++)
        {
            num=arr[i];
            ar[num]=i;
            num=0;
        }
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    public static boolean checkEqual(int arr[],int ar[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ar[i])
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int ar[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        inversearr(arr,ar);
        System.out.println();
        System.out.print(checkEqual(arr,ar));
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}