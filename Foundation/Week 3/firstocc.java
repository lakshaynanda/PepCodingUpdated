import java.util.*;
import java.io.*;

public class firstocc
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Number to be searched? ");
		int n=sc.nextInt();
		int arr[]={5,10,12,12,12,99,101,102};
		int first=0;
		int last=arr.length-1;
		int flag=0;
		while(first<=last)
		{

			int mid=(first+last)/2;
				if(arr[mid]==n)
				{
					flag=1;
					//break;
					if(mid-1==n)
					{
						last=mid-1;
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
		return last;
		System.out.println(last);

	}
}