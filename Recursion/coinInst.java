import java.util.*;
public class coinInst {
    static int count=0;
    public static void coinChangecombi(int denom[],int amt, int lpi, String asf)
    {
        if(amt==0)
        {
            count++;
            System.out.println(count+". "+asf);
            return;
        }
        for(int inst=lpi;inst<denom.length;inst++)
        {
            if(amt>=denom[inst])
            {
                coinChangecombi(denom, amt-denom[inst], inst, asf+denom[inst]);
            }
        }
    }
    public static void coinChangepermuat(int denom[],int amt, int lpi, String asf)
    {
        if(amt==0)
        {
            count++;
            System.out.println(count+". "+asf);
            return;
        }
        for(int inst=0;inst<denom.length;inst++)
        {
            if(amt>=denom[inst])
            {
                coinChangepermuat(denom, amt-denom[inst], inst, asf+denom[inst]);
            }
        }
    }
    public static void coinChangepermuat_01(int denom[],int amt, boolean[] vis,int lpi, String asf)
    {
        if(amt==0)
        {
            count++;
            System.out.println(count+". "+asf);
            return;
        }
        for(int inst=0;inst<denom.length;inst++)
        {
            if(amt>=denom[inst])
            {
                vis[inst]=true;
                coinChangepermuat(denom, amt-denom[inst], inst, asf+denom[inst]);
                vis[inst]=false;
            }
        }
    }
    public static void main(String args[])
    {
        boolean[] vis=new boolean
        int denom[]={2,3,5,6};
        coinChangepermuat(denom, 10, 0, "");
    }
}