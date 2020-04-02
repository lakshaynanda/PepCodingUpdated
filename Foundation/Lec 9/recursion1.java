import java.util.*;

public class recursion1
{
	public static void rec(int n)
	{
		if(n==0)
		{
			return;
		}
		else
		{
			//rec(n-1);//Increasing
			System.out.println(n);
			rec(n-1);//Decreasing
			System.out.println(n);
		}
	}
	public static void incdecrec(int n)
	{
		if(n==1)
		{
			System.out.println(n);
			return;
		}
		System.out.println(n);
		incdecrec(n-1);
		System.out.println(n);
	}
	public static int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		int m=n*fact(n-1);
		return m;

	}
	public static void fn(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		fn(n-1);
		System.out.println(n);
		fn(n-1);
		System.out.println(n);
	}
	public static void oddeven(int n)
	{
		if(n==0)
		{
			return;
		}
		else if(n%2==1)
		{
			System.out.println(n);
		}
		oddeven(n-1);
		if(n%2==0)
		{
			System.out.println(n);
		}

	}
	public static void toh(int n, String s, String h, String d)
	{
		if(n==0)
		{
			return;
		}

		toh(n-1,s,d,h);
		System.out.println("move "+n+"th disk from "+s+" to "+d);
		toh(n-1,h,s,d);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		//System.out.println("Factorial is: ");
		String s="Source";
		String h="Helper";
		String d="Destination";
		toh(n,s,h,d);
	}
}