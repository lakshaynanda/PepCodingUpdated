import java.io.*;
import java.util.*;

public class pattern9 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int nsp=2*n-3;
        int nst=1;
        for(int row=1;row<=n;row++)
        {
            int val=1;
            for(int cst=1;cst<=nst;cst++)
            {
                System.out.print(val+" ");
                val++;
            }
            for(int csp=1;csp<=nsp;csp++)
            {
                System.out.print("  ");
            }
            if(row==n)
            {
                nst--;
                val--;
            }
            for(int cst=1;cst<=nst;cst++)
            {
                val--;
                System.out.print(val+" ");
            }
            nst++;
            nsp-=2;
            System.out.println();
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
