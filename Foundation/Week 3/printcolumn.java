import java.util.*;
import java.io.*;

public class printcolumn
{
	static Scanner sc=new Scanner(System.in);

	public static void display(int[][]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}
	public static void display2(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
	}

	public static void add(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}System.out.println();
		}
	}
	
	public static void colPrint(int[][] arr)
	{
		for(int col=0;col<arr.length;col++)
		{
			if(col%2==0)
				for(int row=0;row<arr.length;row++)
				{	
					System.out.print(arr[row][col]+" ");
				}
			else
			{
				for(int row=arr.length-1;row>=0;row--)
				{
					System.out.print(arr[row][col]+" ");
				}
			}
		}
	}
	public static void main(String args[])
	{
		
		System.out.println("Enter number of rows for matrix : ");
		int n=sc.nextInt();
		System.out.println("Enter number of columns for matrix : ");
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		System.out.println("Enter elements of array for matrix : ");
		add(arr);
		colPrint(arr);
		//display2(arr2);
	}
}