import java.util.*;
      
      public class Main{
      
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int nst=1;
        int nsp=n;
        
        for(int row=1;row<=n;row++)
        {
            for(int csp=0;csp<nsp;csp++)
            {
                System.out.print("\t");
            }
            for(int cst=0;cst<nst;cst++)
            {
                System.out.print("*");
            }System.out.println();
            
        }
        
        
        
           // write ur code here
      
       }
      }

