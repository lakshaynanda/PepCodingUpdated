import java.io.*;
import java.util.*;

public class fib {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            //System.out.print(a+" ");
            sum=a+b;
            a=b;
            b=sum;
        }
        System.out.print(a);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}