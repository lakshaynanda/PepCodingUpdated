import java.util.*;
import java.io.*;

public class inverse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dno=1;
		int ans=0;
		while(n!=0)

		{
			int od=n%10;
			n=n/10;
			ans = ans+dno*(int)(Math.pow(10,od-1));
			dno++;
		}
		System.out.println(ans);
	}
}