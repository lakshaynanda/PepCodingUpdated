

import java.util.*;
public class Alternatemaze
{
    public static int mazepath(int sh,int sv)
    {
        if(sv==3 && sh==3)
        {
            return 1;
        }
        int count=0;
        if(sh+1<4)
        {
            count+=mazepath(sh+1,sv);
        }
        if(sv+1<4)
        {
            count+=mazepath(sh,sv+1);
        }
        return count;
    }
    public static void main(String args[])
    {
        System.out.print(mazepath(0,0));
    }
}