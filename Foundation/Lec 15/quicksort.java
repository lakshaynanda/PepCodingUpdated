import java.util.*;
public class quicksort
{
    public static int[] quickSort(int arr[])
    {
        int i=0;int j=0;
        while(i<arr.length)
        {
            if(arr[i]==0)
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
                i++;
            }
            else{
                i++;
            }
        }
        return arr;
    }
    public static int partition(int arr[],int lo,int hi)
    {
        int pivot=arr[hi];
        int i=lo;
        int j=lo;
        while(i<=hi)
        {
            if(arr[i]<=pivot)
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
                i++;
            }
            else
            {
                i++;
            }
        }
        return j-1;
    }
    public static void quickSortFin(int arr[],int lo,int hi)
    {
        if(lo>=hi)
        {
            return;
        }
        int pvtidx=partition(arr, lo, hi);
        quickSortFin(arr,lo,pvtidx-1);
        quickSortFin(arr, pvtidx+1, hi);
    }
    public static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int arr1[]={0,1,0,0,0,1,1,1,0,1};
        int arr[]={3,5,2,4,6,10,9,8};
        quickSortFin(arr,0,arr.length-1);
        display(arr);
    }
}
