import java.util.*;
import java.io.*;

public class reverse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be reversed: ");
		String x = sc.nextLine();
		int w = x.length();
		char ch[] = new char[w];
		
		for(int i=0;i<w;i++)
		{
			ch[w-1]=x.charAt(i);
			w=w-1;
		}
		ch[0]=ch[w];
		
		String str = new String(ch);
		System.out.println(str);

	}
}
