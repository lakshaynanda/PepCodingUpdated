import java.io.*;
import java.util.*;

public class findeleinarr {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int fin=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==fin)
            {
                System.out.println(i);
                break;
            }
            else
            {
                System.out.println("-1");
                break;
            }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}