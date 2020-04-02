import java.io.*;
import java.util.*;

public class sort {
    public static Scanner sc=new Scanner(System.in);
    public static void input(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    public static void bubble(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {    
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void insertionrev(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i;
            while(j>0 && arr[j-1]<key)
            {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=key;
        }
    }
    public static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void selection(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    
    public static void main(String[] args) {
        
        int n=sc.nextInt();
        int a1[]=new int[n];
        int a2[]=new int[n];
        int a3[]=new int[n];
        input(a1);
        input(a2);
        input(a3);
        bubble(a1);
        insertionrev(a2);
        selection(a3);
        display(a1);
        System.out.println();
        display(a2);
        System.out.println();
        display(a3);
        System.out.println();
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}