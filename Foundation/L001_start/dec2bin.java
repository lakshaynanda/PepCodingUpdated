import java.util.*;

public class dec2bin
{
	public static int dectobin(int n)
	{
		int ans = 0;
		int pow=1;
		while(n!=0)
		{
			int r= n%2;
			n=n/2;
			ans=ans+r*pow;
			pow*=10;
		}
		return ans;
	}
	public static void main(String args[])
	{
		System.out.println(dectobin(101));

	}
}