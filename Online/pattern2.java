import java.io.*;
import java.util.*;

public class pattern2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nst=1;
        int nsp=n/2;
        for(int row=1;row<=n;row++)
        {
            for(int csp=1;csp<=nsp;csp++)
            {
                System.out.print(" ");
            }
            for(int cst=1;cst<=nst;cst++)
            {
                System.out.print("*");
            }
            if(row>n/2)
            {
                nst-=2;
                nsp++;
            }
            else
            {
                nst+=2;
                nsp--;
            }
            System.out.println();
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}