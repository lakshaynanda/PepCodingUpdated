import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
            
        boolean isSwap=false;
        if(n1<n2)
        {
            int temp=n1;
            n1=n2;
            n2=temp;
        }
        while(n1!=0)
        {
            int nom=n1%10;
            int ntm=n2%10;
            n1=n1/10;
            n2=n2/10;
            int digit=nom-ntm-borrow;
            if(digit<0)
            {
                digit=digit+b;
                borrow=1;
            }
            else
            {
                borrow=0;
            }
            ans=ans+digit*pow;
            pow=pow*10;
        }
        if(isSwap==true)
        {
            ans=-ans;
        }
        return ans;
   }
        
       // write your code here
   }
  