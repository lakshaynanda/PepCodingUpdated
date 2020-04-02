import java.io.*;
import java.util.*;

public class gcd {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int gcd=1;
        if(n1==0)
        {
            System.out.println(n2);
        }
        for(int i=1;i<=n1 && i<=n2;i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                gcd=i;
               //break;
            }
        }
        System.out.print(gcd);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}