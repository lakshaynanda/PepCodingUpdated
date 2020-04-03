import java.util.*;

public class boardPath 
{
    static int counter=0;
    public static void printBoardPath(int sr,int sc,int dr,int dc,String psf)
    {
        if(sr==dr && sc==dc)
        {
            counter++;
            System.out.println(counter+". "+psf);
            return;
        }
        if(sr+1<=dr)
        {
            printBoardPath(sr+1, sc, dr, dc, psf+"H");
        }
        if(sc+1<=dc)
        {
            printBoardPath(sr, sc+1, dr, dc, psf+"V");
        }
        if(sc+1<=dc && sr+1<=dr)
        {
            printBoardPath(sr+1, sc+1, dr, dc, psf+"D");
        }
    }
    public static void printMultiBoardPath(int sr,int sc,int dr,int dc,String psf)
    {
        if(sr==dr && sc==dc)
        {
            counter++;
            System.out.println(counter+". "+psf);
            return;
        }
        for(int minAmp=1;minAmp<=dc-sc;minAmp++)
        {
            printMultiBoardPath(sr, sc+minAmp, dr, dc, psf+"V"+minAmp);
        }
        for(int minAmp=1;minAmp<=dr-sr;minAmp++)
        {
            printMultiBoardPath(sr+minAmp, sc, dr, dc, psf+"H"+minAmp);
        }
        for(int minAmp=1;minAmp<=dc-sc && minAmp<=dr-sr;minAmp++)
        {
            printMultiBoardPath(sr+minAmp, sc+minAmp, dr, dc, psf+"D"+minAmp);
        }
    }
    public static void main(String args[])
    {
        printMultiBoardPath(0, 0, 2, 2, "");
    }
}