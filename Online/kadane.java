import java.io.*;
import java.util.*;

public class kadane {
    public static void maxSumSubArray(int arr[])
    {
        int sum=0;
        int max=0;
        int os=0;
        int oe=0;
        int cs=0;
        int ce=0;
        while(ce<arr.length)
        {
            if(sum>0)
            {
                sum=sum+arr[ce];
            }
            else
            {
                cs=ce;
                sum=arr[ce];
            }
            if(max<sum)
            {
                max=sum;
                os=cs;
                oe=ce;
            }ce++;
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[m];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int arr1[]=new int[k];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        maxSumSubArray(arr);
        maxSumSubArray(arr1);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}