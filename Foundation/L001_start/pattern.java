import java.util.*;
            
            public class pattern{
            
            public static void main(String[] args) {
                Scanner scn = new Scanner(System.in);
                int n=scn.nextInt();
                
                int nst=1;
                int nsp=(n-1);
                
                for(int row=1;row<=n;row++)
                {
                    for(int csp=1;csp<=nsp;csp++)
                    {
                        System.out.print(" ");
                    }
                    for(int cst=1;cst<=row;cst++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                    nst++;
                	nsp--;
                }
                
                 // write ur code here
            
             }
            }