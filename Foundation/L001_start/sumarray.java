import java.util.*;
public class sumarray
{
	public static void addarray(int a[],int b[])
	{
		int mySize=a.length<b.length?b.length+1:a.length+1;
		int answer[]=new int[mySize];
		int i=a.length-1;
		int j=b.length-1;
		int k=answer.length-1;
		int carry=0;
		while(i>=0 && j>=0)
		{
			int number=a[i]+b[j]+carry;
			carry=number/10;
			number=number%10;
			answer[k]= number;

			i--;
			j--;
			k--;
		}
		if(i>=0)
		{
			while(i>=0)
			{
				int number=a[i]+carry;
				carry=number/10;
				number=number%10;
				answer[k]= number;
				i--;
				k--;
			}
		}
		if(j>=0)
		{
			while(j>=0)
			{
				int number=b[i]+carry;
				carry=number/10;
				number=number%10;
				answer[k]= number;
				j--;
				k--;
			}
		}
		if(carry>0)
		{
			answer[k]=carry;
		}
		for(int m=0;m<answer.length;m++)
		{
			System.out.println(answer[m]);
		}

	}
	public static void main(String args[])
	{
		int a[]={9,9,9};
		int b[]={9,9,9};
		addarray(a,b);
		
	}
}