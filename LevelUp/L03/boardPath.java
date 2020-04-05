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
    public static ArrayList<String> printBoardreturn(int sr,int sc,int dr,int dc,String psf)
    {
        if(sr==dr && sc==dc)
        {
            counter++;
            ArrayList<String> baseRes=new ArrayList<String>();
            baseRes.add(counter+". ");
            return baseRes;
        }
        ArrayList<String> myAns=new ArrayList<>();
        
        if(sr+1<=dr)
        {
            ArrayList<String> recAns1=printBoardreturn(sr+1, sc, dr, dc, psf+"H");
            for(String str:recAns1)
            {
                myAns.add(psf+"H");
            }
        }
        if(sc+1<=dc)
        {
            ArrayList<String> recAns2=printBoardreturn(sr, sc+1, dr, dc, psf+"V");
            for(String str:recAns2)
            {
                myAns.add(psf+"V");
            }
        }
        if(sr+1<=dr && sc+1<=dc)
        {
            ArrayList<String> recAns3=printBoardreturn(sr+1, sc+1, dr, dc, psf+"D");
            for(String str:recAns3)
            {
                myAns.add(psf+"D");
            }
        }
        return myAns;
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
    public static void floodfill(int sr, int sc, int dr, int dc, String psf)
    {
        if(sr==dr && sc==dc)
        {
            counter++;
            System.out.print(counter+". "+psf);
            return;
        }
        
    }
    public static void main(String args[])
    {
        int dir[8][2]={{0,1},{-1,1},{-1,0},{-1,-1},{0,-1},{1,-1},{1,0},{1,1};
        String dirN[8]={"R","E","U","N","L","W","D","S"};
        // System.out.print(printBoardreturn(0, 0, 2, 2, ""));
        print8dPath(0, 0, 3, 3, "");
    }
}