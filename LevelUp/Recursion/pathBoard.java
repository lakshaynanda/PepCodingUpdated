import java.util.*;

public class pathBoard {
    static int counter=0;
    public static void pbp(int sr,int sc,int dr,int dc,String psf)
    {
        if(sr==dr && sc==dc)
        {
            counter++;
            System.out.println(counter+". "+psf);
            return;
        }
       
        if(sr+1<=dr)//Horizontl
        {
            pbp(sr+1, sc, dr, dc, psf+"H");
        }
        if(sc+1<=dc)//Vertical
        {
            pbp(sr, sc+1, dr, dc, psf+"V");
        }
        if(sc+1<=dc && sr+1<=dr)//Diagonal
        {
            pbp(sr+1,sc+1,dr,dc,psf+"D");
        }
    }
    public static void pbpmulti(int sr,int sc,int dr,int dc,String psf)
    {
        if(sr==dr && sc==dc)
        {
            counter++;
            System.out.println(counter+". "+psf);
            return;
        }
        for(int minAmp=1;minAmp<=dr-sr;minAmp++)//Horizontal
        {
            pbpmulti(sr+minAmp, sc, dr, dc, psf+"H"+minAmp);
        }
        for(int minAmp=1;minAmp<=dc-sc;minAmp++)//Vertical
        {
            pbpmulti(sr, sc+minAmp, dr, dc, psf+"V"+minAmp);
        }
        for(int minAmp=1;minAmp<=dr-sr && minAmp<=dc-sc;minAmp++)//Diagonal
        {
            pbpmulti(sr+minAmp, sc+minAmp, dr, dc, psf+"D"+minAmp);
        }
    }
    public static void main(String args[])
    {
        pbpmulti(0, 0, 3, 3, "");
    }
}