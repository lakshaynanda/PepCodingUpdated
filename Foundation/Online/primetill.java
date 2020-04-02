import java.util.Scanner;
 
public class primetill {
 
    private static Scanner sc = new Scanner( System.in );
 
    public static void main(String[] args) {

        int maxNumber = sc.nextInt();
        
        for (int num=2;num<=maxNumber;num++)
        {
            boolean isPrime=true;
            for (int i=2;i<=num/2;i++)
            {
                if (num%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
 
            if(isPrime==true)
                System.out.print(num+" ");
        }
    }
}