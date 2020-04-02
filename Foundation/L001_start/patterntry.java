import java.util.*;
import java.util.*;

public class patterntry
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows for the pattern: ");
		int n =  sc.nextInt();
		int nst=5;
		int nsp=n-1;
		for(int row=1;row<=n;row++)
		{
			
			for(int csp=n;csp>row;csp--)
			{
				System.out.print(" ");
			}
			for(int cst=1;cst<=nst;cst++)
			{
				if(cst==1||cst==row||row==n)
					System.out.print("*");
				else
					System.out.print(" ");		
			}
			System.out.println("");
			
			/*if(row<=n/2)
			{
				nst-=1;
				nsp++;
			}
			else
			{
				nst+=1;
				nsp--;
			}*/

		}

	}
}