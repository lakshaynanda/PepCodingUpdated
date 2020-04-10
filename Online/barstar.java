import java.io.*;
import java.util.*;

public class barstar{
public static Scanner sc=new Scanner(System.in);
public static int[] add(int arr[])
{
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    return arr;
}
public static void printchart(int arr[])
{
    int max=arr[0];
    for(int i=0;i<arr.length;i++)
    {
        if(max<arr[i])
        {
            max=arr[i];
        }
    }
    for(int floor=max;floor>=1;floor--)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=floor)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print("\t");
            }
        }
        System.out.println();
    }
}

public static void main(String[] args) throws Exception {
    int n=sc.nextInt();
    int arr[]=new int[n];
    add(arr);
    printchart(arr);
    // write your code here
 }

}