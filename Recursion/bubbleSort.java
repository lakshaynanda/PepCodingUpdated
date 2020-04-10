import java.util.*;
public class bubbleSort
{
    public static void BubbleSorted(int arr[],int si,int li)
    {
        if(li==0)
        {
            return;
        }
        if(si==li)
        {
            BubbleSorted(arr, 0, li-1);
            return;
        }
        if(arr[si]>arr[si+1])
        {
            int temp=arr[si];
            arr[si]=arr[si+1];
            arr[si+1]=temp;
        }
        BubbleSorted(arr, si+1, li);
    }
    public static void main(String args[])
    {
        int arr[]={5,33,-1,7,15};
        BubbleSorted(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}