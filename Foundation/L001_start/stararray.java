import java.util.*;
public class stararray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[]= new int[size];

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		for(int i=0;i<max;i++)
		{
			for(int j=0;j<arr[i];j++)
			{
				System.out.print("*");
			}System.out.println();
		}
	}
}