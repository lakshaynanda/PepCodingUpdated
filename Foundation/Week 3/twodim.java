import java.util.*;
import java.io.*;

public class twodim
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
	public static void mult(int[][] arr1,int[][] arr2,int[][] arr3)
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				arr3[i][j]=0;
				for(int k=0;k<arr1.length;k++)
				{
					arr3[i][j]+=arr1[i][k]*arr2[k][j];
				}
			}
		}
	}
	public static void main(String args[])
	{
		
		System.out.println("Enter number of rows for matrix 1: ");
		int n=sc.nextInt();
		System.out.println("Enter number of columns for matrix 1: ");
		int m=sc.nextInt();
		int arr1[][]=new int[n][m];
		System.out.println("Enter elements of array for matrix 1: ");
		add(arr1);
		System.out.println("Enter number of rows for matrix 2: ");
		int n1=sc.nextInt();
		System.out.println("Enter number of columns for matrix 2: ");
		int m1=sc.nextInt();
		int arr2[][]=new int[n1][m1];
		System.out.println("Enter elements of array for matrix 2: ");
		add(arr2);
		int arr3[][]=new int[n][m1];
		mult(arr1,arr2,arr3);
		display(arr3);
	}
}