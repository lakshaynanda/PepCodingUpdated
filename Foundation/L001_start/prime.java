import java.util.*;
import java.io.*;

public class prime{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Check Primes till?");
		int number=sc.nextInt();
		
		
		for(int j=3;j<=number;j++)
		{
			boolean flag=true;
			for(int i=2;i*i <= number;i++)
			{
				if(j%i==0)
				{
					//System.out.println("Not Prime");
					flag=false;
					break;
				}
				
			}

		if(flag)
		{
			System.out.println("");
		}
		}
		
}
}


