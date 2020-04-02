import java.io.*;
import java.util.*;

public class pattern7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=0;row<n;row++)
        {
            int icj=1;
            for(int col=0;col<=row;col++)
            {
                System.out.print(icj+" ");
                int icjp1=icj*(row-col)/(col+1);
                icj=icjp1;
            }System.out.println();
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}