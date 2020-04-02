import java.util.*;
public class mergearraysort
{
    public static Scanner sc=new Scanner(System.in);
    public static void input(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    public static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] merge(int[] arr, int[] ar){
        int [] mergeArr = new int[arr.length+ar.length];
        int i = 0, j = 0, k = 0;
        while(i<arr.length && j<ar.length)
        {
            if(arr[i]<ar[j])
            {
                mergeArr[k]=arr[i];
                i++;k++;
            }
            else
            {
                mergeArr[k]=ar[j];
                j++;k++;
            }
        }
        while(i<arr.length)
        {
            mergeArr[k]=arr[i];
            i++;k++;
        }
        while(j<ar.length)
        {
            mergeArr[k]=ar[j];
            j++;k++;
        }
        return mergeArr;
    }
    public static void merge2sorarr(int arr[],int ar[],int fin[])
    {
        int i=0;
        int j=0;
        int k=0;
        while(i<arr.length && j<ar.length)
        {
            if(arr[i]<ar[j])
            {
                fin[k]=arr[i];
                i++;k++;
            }
            else
            {
                fin[k]=ar[j];
                j++;k++;
            }
        }
        while(i<arr.length)
        {
            fin[k]=arr[i];
            i++;k++;
        }
        while(j<ar.length)
        {
            fin[k]=ar[j];
            j++;k++;
        }
    }
    public static int[] mergesort(int arr[],int lo,int hi)
    {
        if(lo==hi)
        {
            int base[]=new int[1];
            base[0]=arr[lo];
            return base;
        }
        int mid=(lo+hi)/2;
        int left[]=mergesort(arr, lo, mid);
        int right[]=mergesort(arr, mid+1, hi);
        int sorted[]=merge(left, right);
        return sorted;

    }
    public static void main(String args[])
    {
        // int n=sc.nextInt();
        int arr[]={1,3,5,7,9,6,4,11};
        // input(arr);
        // int m=sc.nextInt();
        int ar[]={2,4,6,8};
        // input(ar);
        // int fin[]=new int[m+n];
        // merge2sorarr(arr, ar, fin);
        //int [] ans = merge(arr, ar);
        arr=mergesort(arr, 0, arr.length-1);
        display(arr);
    }
}
