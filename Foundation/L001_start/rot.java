import java.util.*;
import java.io.*;


public class sir{
	public static Scanner sc=new Scanner(System.in);
	

	public static void main(String args[]){
		rotateNumber(sc.nextInt(),sc.nextInt());
	
}
	public static int numdigits(int n)
	{	
		int count=0;
		while(n!=0)
		{
			n/=10;
			count++;
		}
		return count;
	}
	public static void rotateNumber(int n, int r)
	{
		int count=numdigits(n);
		r%=count;
		//System.out.println(r);
		if(r<0)
		{
			r+=count;
		}

			int mul=1;
			int var=count-lr;
			while(var>0)
			{
				mul*=10;
				var--;
				
			}
			ans=ans*mul;
			ans=ans+n;
			System.out.println(ans);
			}
		}
	




