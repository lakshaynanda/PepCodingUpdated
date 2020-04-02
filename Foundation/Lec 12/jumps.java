import java.util.*;

public class jumps
{
    public static ArrayList<String> path(int steps)
    {
        if(steps==0)
        {
            ArrayList<String> baserec=new ArrayList<>();
            baserec.add("");
            return baserec; 
        }
        ArrayList<String> ans=new ArrayList<String>();
        // int myans=0;
        for(int i=1;i<=steps;i++)
        {
            if(steps-i>=0)
            {
                ArrayList<String> recans=path(steps-i);
                for(String str:recans)
                {
                    ans.add(i+str);
                }
            }
        }
        return ans;
    }
        
    public static int jumping(int steps)
    {
        if(steps==0)
        {
            return 1;
        }
        int myans=0;
        if(steps-1>=0)
        {
            myans+=jumping(steps-1);
        }
        if(steps-2>=0)
        {
            myans+=jumping(steps-2);
        }
        if(steps-3>=0)
        {
            myans+=jumping(steps-3);
        }
        return myans;
    }    
    public static void main(String args[])
    {
        int n=50;
        System.out.println(jumping(n));
        
    }
}