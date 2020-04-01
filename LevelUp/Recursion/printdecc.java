import java.util.*;
public class printdecc
{
    public static void printDec(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n);
        printDec(n-1);
        
    }
    public static void printInc(int n)
    {
        if(n==-1)
        {
            return;
        }
        printInc(n-1);
        System.out.print(n);
    }
    public static void printDecInc(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n);
        printDecInc(n-1);
        System.out.print(n);
    }
    public static void main(String args[])
    {
        printDecInc(5);
        // printInc(5);
        // printDec(5);
        System.out.println();

    }
}