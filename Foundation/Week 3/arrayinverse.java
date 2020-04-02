import java.util.*;
import java.io.*;

public class arrayinverse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int array[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			int temp=arr[i];
			array[temp]=i;
		}
		for(int j=0;j<array.length;j++)
		{
			System.out.println(array[j]);
		}
		

	}
}