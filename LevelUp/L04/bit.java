import java.util.*;
public class bit {
    public static int bitOffToOn(int n, int k)
    {
        int mask = ( 1 << k-1 );
        return (n | mask);
    }
    public static int bitOnToOff(int n,int k)
    {
        int mask = (~( 1 << k-1 ));
        return (n & mask);
    }
    public static int NoOfBits(int num)
    {
        int bitCount=0;
        int totalBits=32;
        while(num!=0 && totalBits!=0)
        {
            if((num & 1)!=0)
            {
                bitCount++;
            }
            num>>=1;
            totalBits--;    
        }
        return bitCount;
    }
    public static void main(String args[])
    {
        int n=11001001;
        int k=4;
        System.out.println(bitOnToOff(n, k));
    }

}