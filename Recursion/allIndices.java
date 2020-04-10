import java.util.*;
public class allIndices
{
    public static int[] printIndices(int arr[],int data,int i,int count)
    {
        if(i==arr.length)
        {
            return new int[count];
        }
        int temp[]=null;
        if(arr[i]==data)
        {
            temp=printIndices(arr, data, i+1, count+1);
            temp[count]=i;
        }
        else
        {
            temp=printIndices(arr, data, i+1, count);
        }
        return temp;
    }
    public static void main(String args[])
    {
        int arr[]={5,9,23,9,2,9,-1,9};
        int data=9;
        int ans[]=printIndices(arr, data, 0, 0);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}