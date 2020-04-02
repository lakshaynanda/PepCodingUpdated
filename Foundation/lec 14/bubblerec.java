import java.util.*;
public class bubblerec
{
    public static void bubble(int arr[],int st,int end)
    {
        if(st==end)
        {
            if(end==0)
            {
                return;
            }
            bubble(arr,0,end);
            return;
        }
        if(arr[st]>arr[st+1])
        {
            int temp=arr[st];
            arr[st]=arr[st+1];
            arr[st+1]=temp;
        }
        bubble(arr,st+1,end);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        bubble(arr,0,arr.length-1);
    }
}