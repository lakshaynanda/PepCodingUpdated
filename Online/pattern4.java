import java.io.*;
import java.util.*;

public class pattern4 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        // int nst=;
        // int nsp=;
        for(int row=1;row<=n;row++)
        {
            for(int column=1;column<=n;column++)
            {
                if(row==column || row==n-column+1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }System.out.println();
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}