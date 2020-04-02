import java.util.*;
import java.io.*;

public void fibo2(int n, int a, int b)
{
	//System.out.println("Fino till?");
	//int n=sc.nextInt();
	int a=0;
	int b=1;
	for(int i=0;i<z;i++)
	{
		System.out.println(a+" ");
		int sum=a+b;
		a=b;
		b=sum;
	}
		
}
public class fibo
{
	public static void main(String args[])
	{
		/*Scanner sc =new Scanner(System.in);
		System.out.println("Fino till?");
		int n=sc.nextInt();

		int a=0;
		int b=1;
		for(int i=0;i<n;i++)
		{
			
			int sum=a+b;
			a=b;
			b=sum;
		}
		System.out.println(a+" ");*/
		fibo2(8,0,1);
	}
}