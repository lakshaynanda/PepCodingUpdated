import java.util.*;
public class fact
{
	public static int fac(int num)
	{
		int factorial;
		for(factorial = 1; num > 1; num--){
		factorial *= num;
		}return factorial;
	}
	public static int npr(int a, int b)
	{
		int perm=1;
		perm=fac(a)/fac(a-b);
		return perm;
	}
	public static void main(String args[])
	{
		System.out.println(npr(4,2))````;
	}
}