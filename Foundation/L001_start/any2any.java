import java.util.*;
public class any2any
{
	public static int any2dec(int n,int b1)
	{
		int ans=0;
		int pow=1;
		while(n!=0)
		{
			int r=n%10;
			n=n/10;
			ans=ans+r*pow;
			pow*=b1;
		}
		return ans;
	}
	public static int dec2any(int z,int b2)
	{
		int pow = 1;
		int ans=0;
		while(z!=0)
		{
			int r = z%b2;
			z = z/b2;
			ans = ans+r*pow;
			pow*=10;
		}
		return ans;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int p=any2dec(x,y);
		System.out.println(p);
		int q=sc.nextInt();
		System.out.println(dec2any(p,q));		

	}
}