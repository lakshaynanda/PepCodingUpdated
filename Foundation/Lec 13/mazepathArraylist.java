import java.util.*;
public class mazepathArraylist
{
    public static ArrayList<String> mazepath(int sr,int sc,int er,int ec)
    {
        if(sr==er && sc==ec)
        {
            ArrayList<String> path=new ArrayList<>();
            path.add("");
            //System.out.println(psf);
            
            return path;
            
        }
        ArrayList<String> ans=new ArrayList<String>();
        //int count=0;
        if(sr+1<=er)
        {
            ArrayList<String> recpath=mazepath(sr+1,sc,er,ec);
            for(String str:recpath)
            {
                ans.add("V"+str);
            }
        }
        if(sc+1<=ec)
        {
            ArrayList<String> recpath=mazepath(sr,sc+1,er,ec);
            for(String str:recpath)
            {
                ans.add("H"+str);
            }
    }
    System.out.println(ans.size());
    return ans;
    }
    public static void main(String args[])
    {
        System.out.println(mazepath(0,0,3,3));       
    }
}