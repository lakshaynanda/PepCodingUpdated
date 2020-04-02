import java.util.*;

public class dectoab
{
	public static int dectoany(int n,int b)
	{
		int ans = 0;
		int pow = 1;
		while(n!=0)
		{
			int r= n%b;
			n=n/b;
			ans=ans+r*pow;
			pow*=10;
		}
		return ans;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int z=sc.nextInt();
		System.out.println(dectoany(x,z));

	}
}