import java.io.*;
import java.util.*;
public class L001
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 3 numbers to compare: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int maxNum=-1;
		if(a>=b && a>=c)
		{
			maxNum=a;
		}
		else if (b>=a && b>=c)
		{
			maxNum=b;
		}
		else
		{
			maxNum=c;
		}
		System.out.println(maxNum +" is your biggest number");

	}
}