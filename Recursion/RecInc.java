import java.util.*;
public class RecInc
{
    public static void printInc(int n,int m) {
        if (n == m+1) {
            return;
        }
        System.out.print(n);
        printInc(n,m-1);
        System.out.print(n);
        
        
        
    }

    public static void main(String args[]) {
        int n = 1;
        int m=10;
        printInc(n,m);
    }
}