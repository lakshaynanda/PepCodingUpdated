import java.util.*;
import java.io.*;

public class maxinarray
{
	public static void maxSumSubArray(int arr[])
	{
		//kadane
		int sum=0;
		int max=0;
		int ostart=0;
		int oend=0;
		int cs=0;
		int ce=0;

		while(ce<arr.length)
		{
			if(sum>0)
			{
				sum=sum+arr[ce];
			}else
			{
				cs=ce;
				sum=arr[ce];
			}
			
			if(max<sum)
			{
				max=sum;
				ostart=cs;
				oend=ce;
			}ce++;
		}
		System.out.println("Maximum maxSumSubArray is: ");
		for(int i=ostart;i<=oend;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Maximum value is: " + max);
	}
	public static void main(String args[])
	{
		int arr[]={5,-3,2,-8,1,4,7,-1,6,-8};
		maxSumSubArray(arr);
		
	}
}