import java.io.*;
import java.util.*;

public class pattern3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nst=n/2+1;
        int nsp=1;
        for(int row=1;row<=n;row++)
        {
            for(int cst=1;cst<=nst;cst++)
            {
                System.out.print("*");
            }
            for(int csp=1;csp<=nsp;csp++)
            {
                System.out.print(" ");
            }
            for(int ast=1;ast<=nst;ast++)
            {
                System.out.print("*");
            }
            if(row<=n/2)
            {
                nst--;
                nsp+=2;
            }
            else{
                nst++;
                nsp-=2;
            }
            System.out.println();
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}