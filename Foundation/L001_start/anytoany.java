import java.util.*;

public class anytoany
{
	public static int any2any(int n,int b1,int b2)
	{
		int ans = 0;
		int pow = 1;
		while(n!=0)
		{
			int r= n%b2;
			n=n/b2;
			ans=ans+r*pow;
			pow*=b1;
		}
		return ans;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();

		System.out.println(any2any(x,y,z));

	}
}