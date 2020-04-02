import java.util.*;
import java.io.*;
public class array1accto2
{
	
	public static void rearrange(int index[],int value[])
	{
		for(int i=0;i<value.length;i++)
		{
			while(index[i]!=i)
			{
				int idx=index[i];
				swap(value,i,idx);
				swap(index,i,idx);
			}
		}
	}
	public static void swap(int arr[], int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();

		int arr[]={50,40,30,70,60,90};
		int index[]={3,0,4,1,2,5};
		rearrange(index,arr);
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
	}
}