import java.io.*;
import java.util.*;

public class pattern5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=1;
        int nst=1;
        for(int row=1;row<=n;row++)
        {
            for(int cst=1;cst<=nst;cst++)
            {
                System.out.print(sum+"\t");
                sum++;
            }System.out.println();
            nst++;
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}