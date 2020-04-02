import java.util.*;
public class array{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(arr[i]);
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}

		}
		int span=max-min;
		System.out.println("Span is: ");
		System.out.println(span);

	}
}