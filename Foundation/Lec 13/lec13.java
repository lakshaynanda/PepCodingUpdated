import java.util.*;
public class lec13
{
    public static int mazepath(int sr,int sc,int er,int ec,String psf)
    {
        if(sr==er && sc==ec)
        {
            System.out.println(psf);
            return 1;
            
        }
        int count=0;
        if(sr+1<=er)
        {
            count+=mazepath(sr+1,sc,er,ec,psf+"v");
        }
        if(sc+1<=ec)
        {
            count+=mazepath(sr,sc+1,er,ec,psf+"h");
        }
        return count;
    }
    public static void main(String args[])
    {
        System.out.println(mazepath(0,0,3,3,""));
    }
}