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
			if(n==1)
			{
				return;
			}
			System.out.println(n);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		System.out.println("Numbers are: ");
		rec(n);
	}
}