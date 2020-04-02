import java.util.*;
import java.io.*;

public class loop{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Print table for?");
		int table=sc.nextInt();
		System.out.println("Till what value?");
		int n=sc.nextInt();
		System.out.println("The table is: ");
		for(int i=1;i<=n;i++)
		{
			System.out.println(table*i);
		} 
	}
}