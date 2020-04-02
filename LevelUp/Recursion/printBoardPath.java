import java.util.*;
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
    public static void main(String args[])
    {
        pbp(0, 10, "");
    }
}