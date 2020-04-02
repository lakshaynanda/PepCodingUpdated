import java.util.*;
import java.io.*;

public class floorceil
{
	public static int getFloorCeil(int arr[],int n)
	{
		int first=0;
		int ceil=-1;
		int last=arr.length-1;
		while(first<=last)
		{

			int mid=(first+last)/2;
				if(arr[mid]==n)
				{
					//last=mid-1;
					return arr[mid];
					
				}
				else if(arr[mid]>n)
				{
					ceil=arr[mid];
					last=mid-1;

					System.out.println(first);
					System.out.println(last);
					
				}
				else
				{
					first=mid+1;
				}
		}
		return ceil;
		
	}
	public static void main(String args[])
	{
		int arr[]={3,3,3,3,5,5,5,6,6,7,7};
		int x = binarySearch(arr,3);
		System.out.println(x);
		
	}
}