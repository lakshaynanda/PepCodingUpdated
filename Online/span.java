import java.io.*;
import java.util.*;

public class span{
public static Scanner sc=new Scanner(System.in);
public static int max(int arr[])
{
    int max=arr[0];
    for(int i=0;i<arr.length;i++)
    {
        if(max<arr[i])
        {
            max=arr[i];
        }
    }
    return max;
}

public static int min(int arr[])
{
    
    int min=arr[0];
    for(int i=0;i<arr.length;i++)
    {
        if(min>arr[i])
        {
            min=arr[i];
        }
    }
    return min;
}
public static int[] add(int arr[])
{
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    return arr;
}
public static void main(String[] args) throws Exception {
    // write your code here
    
    int n=sc.nextInt();
    int arr[]=new int[n];
    add(arr);
    int m=max(arr);
    int mi=min(arr);
    System.out.println(m-mi);
    
 }

}