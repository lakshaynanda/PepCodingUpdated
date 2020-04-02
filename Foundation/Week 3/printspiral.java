import java.util.*;
import java.io.*;

public class printspiral
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
	
	public static void spiralPrint(int[][] arr)
	{
		int count=0;
		int minr=0;
		int maxr=arr.length-1;
		int minc=0;
		int maxc=arr[0].length-1;
		while(count< arr.length*arr[0].length)
		{
			for(int i=minr;i<=maxr;i++)
			{
				System.out.print(arr[i][minc]+" ");
				count++;
			}
			minc++;
			for(int i=minc;i<=maxc;i++)
			{
				System.out.print(arr[maxr][i]+" ");
				count++;

			}
			maxr--;
			for(int i=maxr;i>=minr;i--)
			{
				System.out.print(arr[i][maxc]+" ");
				count++;
			}
			maxc--;
			for(int i=maxc;i>=minc;i--)
			{
				System.out.print(arr[minr][i]+" ");
				count++;
			}
			minr++;
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
		spiralPrint(arr);
		//display2(arr2);
	}
}