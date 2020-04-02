import java.util.*;
public class newpatt
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int nst=1;
		int nsp=n-1;
		for(int row=1;row<=n;row++)
		{
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print(" ");
			}
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("*");
			}System.out.println("");
			/*{
				if(row<=n/2)
				{
					nst+=2;
					nsp--;
				}
				else
				{
					nst-=2;
					nsp++;
				}
			}*/
		}
	}
}