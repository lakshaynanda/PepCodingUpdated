import java.util.*;
public class Recu
{
    public static void recursion(int n)
    {
        if(n==0)
        {
            return;
        }
        recursion(n-1);
        System.out.print(n);
        recursion(n+1);
        System.out.print(n);
    }
    public static void main(String args[])
    {
        int n=10;
        recursion(n);
    }
}