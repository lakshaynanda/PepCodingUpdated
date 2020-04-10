import java.io.*;
import java.util.*;

public class pattern6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int nst=1;
        int a=0;
        int b=1;
        for(int row=1;row<=n;row++)
        {
            for(int cst=1;cst<=nst;cst++)
            {   
                System.out.print(a+" ");
                sum=a+b;
                a=b;
                b=sum;
            }
            System.out.println();
            nst++;
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}