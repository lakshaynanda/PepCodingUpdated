import java.io.*;
import java.util.*;

public class reversenum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pow=1;
        int reversed=0;
        while(n!=0)
        {
            int dig=n%10;
            reversed=reversed*10+dig;
            n=n/10;
        }
        System.out.print(reversed);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}