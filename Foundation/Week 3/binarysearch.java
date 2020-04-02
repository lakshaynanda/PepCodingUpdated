import java.util.*;
import java.io.*;

public class binarysearch
{
	public static int binarySearch(int arr[],int n)
	{
		int first=0;
		int last=arr.length-1;
		while(first<=last)
		{

			int mid=(first+last)/2;
				if(arr[mid]==n)
				{
					//return true;
					if(mid-1>=0 && arr[mid-1]==n)
					{
						last=mid-1;
						//return last;
					}
					else
					{
						return mid;
					}
				}
				else if(arr[mid]>n)
				{
					last=mid-1;
					
				}
				else
				{
					first=mid+1;
				}
		}
		return 0;
	}
	public static void main(String args[])
	{
		int arr[]={3,3,3,3,5,5,5,6,6,7,7};
		int x = binarySearch(arr,3);
		System.out.println(x);
		
	}
}