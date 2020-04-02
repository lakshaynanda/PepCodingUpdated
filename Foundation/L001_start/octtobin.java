import java.util.*;
public class octtobin
{
	public static int oct2bin(int n)
	{
		int pow=1;
		int power=1;
		int ans=0;
		while(n!=0)
		{
			int r=n%8;
			n=n/8;
			ans=ans+r*pow;
			pow*=10;

			int rem=ans%2;
			ans=ans/2;
			power*=10;
		}
		return ans;
	}
	public static void main(String args[])
	{
		oct2bin(57);
	}
}