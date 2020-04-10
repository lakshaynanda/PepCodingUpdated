import java.io.*;
import java.util.*;

public class pattern10 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nst=1;
        int nsp=n-1;
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
            nsp--;
            nst+=2;
            val++;
            System.out.println();
            
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}