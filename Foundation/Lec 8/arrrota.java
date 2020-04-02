import java.util.*;
import java.io.*;

public class arrrota
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
	public static void transpose(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i<j)
				{
					int temp2=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp2;
				}
			}
		}
	}
	public static void rotate(int [][]arr)
	{
		transpose(arr);
		for(int i=0;i<arr.length/2;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[arr.length-1-i][j];
				arr[arr.length-1-i][j]=temp;
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
		//transpose(arr);
		rotate(arr);
		display(arr);

	}
}