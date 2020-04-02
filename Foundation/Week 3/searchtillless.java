import java.util.*;
import java.io.*;

public class searchtillless
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Number to be searched? ");
		int n=sc.nextInt();
		int arr[]={5,10,12,18,22,99,101,102};
		int first=0;
		int last=arr.length-1;
		int flag=0;
		while(first<=last)
		{

			int mid=(first+last)/2;
				if(arr[mid]==n)
				{
					flag=1;
					break;
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
		if(flag==1)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}

	}
	
}