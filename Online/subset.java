import java.io.*;
import java.util.*;

public class subset {

    public static void subarr(int []arr)
    {
        for(int i=0;i <(1<<arr.length);i++)
        {
            System.out.print("[");
            for(int j=0;j<arr.length;j++)
            {
                if ((i & (1 << j)) > 0) 
                    System.out.print(arr[j] + " "); 
  
             
            }System.out.println("]");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        subarr(arr);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}