import java.io.*;
import java.util.*;

public class findelearray{
public static Scanner sc=new Scanner(System.in);
public static int[] add(int arr[])
{
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    return arr;
}
public static int find(int arr[],int d)
{
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==d)
        {
            return i;
        }
    }return -1;
}
public static void main(String[] args) throws Exception {
    int n=sc.nextInt();
    int arr[]=new int[n];
    add(arr);
    int d=sc.nextInt();
    System.out.print(find(arr,d));
    // write your code here
 }

}