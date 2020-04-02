import java.util.*;
public class stararrayver
{
	public static void printBar(int arr[])
	{
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		for(int i=max;i>0;i--)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]>=i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
	public static void main(String args[])
	{
		int arr[]= {5,3,7,4,2};
		printBar(arr);
	}
}