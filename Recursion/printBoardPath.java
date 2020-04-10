import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class printBoardPath 
{
    static int count=0;
    public static void pbp(int s,int d,String psf)
    {
        if(s==d)
        {
            count++;
            System.out.println(count+". "+psf);
            return;
        }
        if(s>d)
        {
            return;
        }
        for(int dice=1;dice<=6;dice++)
        {
            int intermediate=s+dice;
            pbp(intermediate, d, psf+dice);
        }

    }
    public static void pbpwith16opening(int s, int d, String psf)
    {
        if(s==d)
        {
            count++;
            System.out.println(count+". "+psf);
            return;
        }
        if(s>d)
        {
            return;
        }
        if(s==0)
        {
            pbpwith16opening(1, d, psf+1);
            pbpwith16opening(1, d, psf+6);
        }
        else{
            for(int dice=1;dice<=6;dice++)
            {
                int intermediate=s+dice;
                pbpwith16opening(intermediate, d, psf+dice);
            }
        }
    }
    public static void pbpwith61openingladders(int s,int d,int[] ladder,String psf)
    {
        if(s==d)
        {
            count++;
            System.out.println(psf);
            return;
        }
        if(s>d)
        {
            return;
        }
        if(s==0)
        {
            pbpwith61openingladders(1, d, ladder, psf+1);
            pbpwith61openingladders(1, d, ladder, psf+6);
        }
        else if(ladder[s]!=0)
        {
            pbpwith61openingladders(ladder[s], d,ladder, psf+"["+s+"->"+ladder[s]+"]");
        }
        else{
            for(int dice=1;dice<=6;dice++)
            {
                int intermediate=s+dice;
                pbpwith61openingladders(intermediate, d,ladder, psf+dice);
            }

        }
    }
    public static void pbpwith61openingsnl(int s,int d, int[] snl,int[] moves,int i)
    {
        if(s==d)
        {
            System.out.println("Win");
            return;
        }
        if(i==moves.length)
        {
            System.out.println(s);
            return;
        }
        if(s==0)
        {
            if(moves[i]==1 || moves[i]==6)
            {
                pbpwith61openingsnl(s,d,snl,moves,i+1);
            }
            else
            {
                pbpwith61openingsnl(1,d,snl,moves,i+1);
            }
        }
        else
        {
            if(snl[s]!=0)
            {
                pbpwith61openingsnl(snl[s], d, snl, moves, i);
            }
            else
            {
                if(s+moves[i]<=d)
                {
                    pbpwith61openingsnl(s+moves[i], d, snl, moves, i+1);
                }
                else
                {
                    pbpwith61openingsnl(s, d, snl, moves, i+1);
                }
            }
        }
    }
    public static void main(String args[])
    {
        // int ladder[]=new int[25];
        // ladder[5]=7;
        // ladder[2]=13;
        // ladder[3]=11;
        // pbpwith61openingladders(0, 15, ladder,"");
        int[] snl=new int[25];
        snl[3]=17;
        snl[7]=11;
        snl[13]=5;
        snl[19]=2;
        int moves1[]={2,5,3,4,6,3,4,3,5,1,2,3};
        int moves2[]={2,5,3,4,6,3,4,3,5,1,1,6,5,2,3,5};
        pbpwith61openingsnl(0, 20, snl, moves1, 0);
    }
}