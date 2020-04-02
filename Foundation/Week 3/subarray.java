import java.util.*;
public class subarray
{
	public static void print(int arr[],int i,int j)
	{
		for(int idx=i;idx<=j;idx++)
		{
			System.out.print(arr[idx]+" ");
		}System.out.println("\n");
	}
	public static void findSubArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				print(arr,i,j);
			}
		}
	}
	public static void main(String args[])
	{
		int arr[]={10,20,30,40,50};
		findSubArray(arr);

	}
}