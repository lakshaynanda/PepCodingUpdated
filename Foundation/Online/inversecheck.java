import java.io.*;
import java.util.*;

public class inversecheck {
    public static Scanner sc=new Scanner(System.in);
    public static void input(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    public static void inverse(int arr[],int ar[])
    {
        int m=0;
        for(int i=0;i<arr.length;i++)
        {
            m=arr[i];
            ar[m]=i;
            m=0;
        }
    }
    public static boolean checkEqual(int arr[],int ar[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=ar[i])
            {
                return false;
            }
        }return true;
    }

    public static void main(String[] args) {
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        int ar[]=new int[n];
        int a[]=new int[n];
        input(arr);
        input(ar);
        inverse(arr,a);
        System.out.print(checkEqual(a,ar));
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}