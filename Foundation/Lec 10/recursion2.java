import java.util.*;
import java.io.*;

public class recursion2
{
    public static void arrrec(int arr[],int i)
    {
        if(i==arr.length)
        {
            return;
        }
        System.out.print(arr[i]+" ");
        arrrec(arr,i+1);
        //System.out.print(arr[i]+" ");
    }
    public static void arrrecr(int arr[],int i)
    {
        if(i==arr.length)
        {
            return;
        }
        arrrecr(arr,i+1);
        System.out.print(arr[i]+" ");
    }
    public static int maxinarr(int arr[],int i)
    {
        if(i==arr.length-1)
        {
            return i;
        }
        int max=maxinarr(arr,i+1);
        
        if(arr[i]>arr[max])
        {
            return i;
        }
        return max;
    }
    public static int mininarr(int arr[],int i)
    {
        if(i==arr.length-1)
        {
            return i;
        }
        int min=mininarr(arr,i+1);
        if(arr[min]>arr[i])
        {
           return i;
        }
        return min;
    }
    /*public static int selesort(int arr[],int i)
    {
        if(i=arr.length)
        {
            return -1;
        }
        int min=selesort(arr,i);
        if(arr[min]>arr[i])
        {
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }*/
    public static int firocc(int arr[],int i,int n)
    {
        if(i==arr.length)
        {
            return -1;
        }
        int res=firocc(arr,i+1,n);
        if(arr[i]==n)
        {
            return i;
        }
        //return occ;
        return res;
    }
    public static int lastocc(int arr[],int i,int n)
    {
        if(i==arr.length)
        {
            return -1;
        }
        int res=lastocc(arr,i+1,n);
        
        if(arr[i]==n)
        {
            if(res != -1)
            {
                return res;
            }
            else
            {
                return i;
            }
        }
        return res;
    }
    public static int[] allocc(int arr[],int i, int n,int count)
    {
        if(i==arr.length)
        {
            int baseres[]=new int[count];
            return baseres;
        }
        if(arr[i]==n)
        {
            count++;
        }
        int[] a=allocc(arr,i+1,n,count);
        if(arr[i]==n)
        {
            a[count-1]=i;
        }
        return a;
    }

    public static void main(String args[])
    {
        int arr[]={3,5,3,8,2,7,6,3,9,3,1};
        int a[]=new int[arr.length];
        //arrrec(arr,0);
        //System.out.println();
        //System.out.println(maxinarr(arr,0));
        //System.out.println(mininarr(arr,0));
        //selesort(arr,0);
        //System.out.println(firocc(arr,0,3));
        //System.out.println(lastocc(arr,0,3));
        int []ans=allocc(arr,0,3,0);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }

    }
}