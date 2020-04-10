import java.util.*;
public class factorialrec
{
    public static int fac(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int facto=n*fac(n-1);
        return facto;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fac(n));
    }
}