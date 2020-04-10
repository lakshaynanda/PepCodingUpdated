import java.util.*;

public class powerrec
{
    public static int power(int n,int m)
    {
        if(m==0)
        {
            return 1;

        }
        int top=n*power(n,m-1);
        return top;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        System.out.println(power(n,m));
    }
}