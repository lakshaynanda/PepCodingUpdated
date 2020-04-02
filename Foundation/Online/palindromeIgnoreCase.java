import java.io.*;
import java.util.*;

public class palindomeIgnoreCase {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder str1=new StringBuilder();
        StringBuilder str2=str1.append(str);
        String str3=str1.reverse().toString();
        if(str.equalsIgnoreCase(str3))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}