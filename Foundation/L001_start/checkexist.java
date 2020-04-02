import java.util.*;
public class checkexist
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Number to be checked?");
		int number = sc.nextInt();
		System.out.println("Size of array?");
		int size = sc.nextInt();

		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter "+i+" element of array: ");
			arr[i]=sc.nextInt();
		}
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==number)
			{
				flag=true;
			}
		}
		if(flag==true)
		{
			System.out.println("exists");
		}
		else
		{
			System.out.println("does not exist");
		}
	}
}