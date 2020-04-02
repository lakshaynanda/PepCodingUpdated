import java.util.*;
public class tripleSort
{
    public static int[] quickSort(int arr[])
    {
        int i=0;int j=0; int k=0;
        while(i<arr.length)
        {
            if(arr[i]==0)
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                int temp2=arr[k];
                arr[k]=arr[j];
                arr[j]=temp2;
                j++;
                k++;
            }
            else if(arr[i]==1)
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
        return arr;
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
        int arr[]={0,2,0,2,1,0,2,1,1,0,2};
        quickSort(arr);
        display(arr);
    }
}
