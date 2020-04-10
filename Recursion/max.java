import java.util.*;
public class max
{
    public static int maxInArr(int arr[],int i)
    {
        if(i==arr.length-1)
        {
            return arr[i];
        }
        int max=maxInArr(arr, i+1);
        if(max>arr[i])
        {
            return max;        
        }
        else
        {
            return arr[i];
        }
        
        // return max;

    }
    public static void main(String args[])
    {
        int arr[]={1,2,80,4,3};
        System.out.println(maxInArr(arr,0));
    }
}