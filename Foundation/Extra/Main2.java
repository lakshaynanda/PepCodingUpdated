import java.util.*;
               
               public class Main2{
               
               public static void main(String[] args) {
                   Scanner scn = new Scanner(System.in);
                    int n = scn.nextInt();
                    int nst=1;
                    int nsp=n/2;
                    for(int row=0;row<n;row++)
                    {
                        for(int csp=1;csp<=nsp;csp++)
                        {
                            System.out.print(" ");
                        }
                        for(int cst=0;cst<nst;cst++)
                        {
                            System.out.print("*");
                        }
                        System.out.println();
                        if(row<n/2)
                        {

                            nsp--;
                        }
                        else
                        {
                            //nst-=2;
                            nsp++;
                        }
                    }
                    
                    // write ur code here
               
                }
               }