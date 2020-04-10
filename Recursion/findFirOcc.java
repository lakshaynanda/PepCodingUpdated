import java.util.*;
public class findFirOcc
{
    public static boolean isPresent(int arr[],int data,int i)
    {
        if(i==arr.length)
        {
            return false;
        }
        if(arr[i]==data)
        {
            return true;
        }
        else
        {
            boolean place=isPresent(arr, data, i+1);
            return place;
        }
    }
    public static int findIndex(int arr[],int data,int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
        if(arr[i]==data)
        {
            return i;
        }
        else{
            int place=findIndex(arr, data, i+1);
            return place;
        }
    }
    public static int lastIndex(int arr[],int data,int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
        int lis=lastIndex(arr, data, i+1);
        if(lis!=-1)
        {
            return lis;
        }
        else
        {
            if(arr[i]==data)
            {
                return i;
            }
            else{
                return -1;
            }
        }
    }

    public static void main(String args[])
    {
        int arr[]={1,2,3,5,6,2,93};
        System.out.println(lastIndex(arr, 93, 0));
    }
}