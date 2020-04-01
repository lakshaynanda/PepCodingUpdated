import java.util.*;
public class printArr
{
    public static void printArr(int arr[],int i)
    {
        if(i==arr.length)
        {
            return;
        }
        System.out.println(arr[i]);
        printArr(arr, i+1);
    }
    public static void printreverse(int arr[],int i)
    {
        if(i==-1)
        {
            return;
        }
        System.out.println(arr[i]);
        printreverse(arr, i-1);
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4};
        printreverse(arr,arr.length-1);
    }
}