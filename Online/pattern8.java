import java.io.*;
import java.util.*;

public class pattern8 {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        int nst=1;
        int nsp= n / 2;
        int val=1;
        for(int row=1;row<=n;row++)
        {
            for(int csp=1;csp<=nsp;csp++)
            {
                System.out.print("  ");
            }
            int cval=val;
            for(int cst=1;cst<=nst;cst++)
            {
                System.out.print(cval+" ");
                if(cst<=nst/2)
                {
                    cval++;
                }
                else
                {
                    cval--;
                }
            }
            if(row<=n/2)
            {
                nsp--;
                nst+=2;
                val++;
            }
            else
            {
                nsp++;
                nst-=2;
                val--;
            }
            System.out.println();
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}