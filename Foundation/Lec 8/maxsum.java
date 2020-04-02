import java.util.*;

public class maxsum
{
	static Scanner sc = new Scanner(System.in);
	public static void display2(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
	}
	public static void input(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	public static void calcIAarrI(int arr[])
	{
		int sum=0;
		int rmo=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			rmo+=i*arr[i];
		}
		int max=rmo;
		int nra=0;
		for(int i=1;i<arr.length;i++)
		{
			nra=rmo-sum+arr.length*arr[i-1];
			if(max<nra)
			{
				max=nra;
			}
			rmo=nra;

		}
		return max;
	}
	public static void main(String args[])
	{
		int n=sc.nextInt();
		int arr[] = new int[n];
		input(arr);
		calcIAarrI(arr);

	}
}