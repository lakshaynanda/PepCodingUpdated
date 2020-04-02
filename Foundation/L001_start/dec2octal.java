import java.util.*;

public class dec2octal
{
	public static int dectooctal(int n)
	{
		int ans = 0;
		int pow=1;
		while(n!=0)
		{
			int r = n%10;
			n=n/10;
			ans=ans+r*pow;
			pow*=10;
		}
		return ans;		
	}
	public static int octaladdition(int n1,int n2)
	{
		int pow=1;
		int ans=0;
		int carry=0;
		int sb=8;
		while(n1>0||n2>0||carry>0)
		{
			int nom=n1%10;
			int ntm=n2%10;
			n1=n1/10;
			n2=n2/10;
			int digit=nom+ntm+carry;
			carry=digit/sb;
			digit=digit%sb;

			ans=ans+digit*pow;
			pow=pow*10;

		}
		return ans;
	}
	public static int octalsubtraction(int n1,int n2)
	{
		
		int pow=1;
		int ans=0;
		int borrow=0;
		int sb=8;
		boolean isSwap=false;
		if(n1<n2)
		{
			int temp=n1;
			n1=n2;
			n2=temp;
		}
		while(n1!=0)
		{
			int nom=n1%10;
			int ntm=n2%10;
			n1=n1/10;
			n2=n2/10;
			int digit=nom-ntm-borrow;
			if(digit<0)
			{
				digit=digit+sb;
				borrow=1;
			}
			else
			{
				borrow=0;
			}
			ans=ans+digit*pow;
			pow=pow*10;
		}
		if(isSwap==true)
		{
			ans=-ans;
		}
		return ans;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		//int n2=sc.nextInt();
		 

		System.out.println(dectooctal(n1));

	}
}