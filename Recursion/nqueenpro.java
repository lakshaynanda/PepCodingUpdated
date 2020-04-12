import java.util.*;
public class nqueenpro {
    static int count=0;

    private static boolean theBoardisValid(boolean[][] chess)
    {
        for(int row=0;row<chess.length;row++)
        {
            for(int col=0;col<chess[0].length;col++)
            {
                if(chess[row][col]==true)
                {
                    if(queenIssafe(row,col,chess)==false)
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    private static boolean queenIssafe(int row,int col,boolean[][] chess)
    {
        int [][]dir={
            {0,-1}, //nrth
            {1,-1}, //north east
            {1,0}, //east
            {1,1}, //se
            {0,1}, //south
            {-1,1}, //sw
            {-1,0}, //w
            {-1,-1}, //nw
        };
        for(int di=0;di<dir.length;di++)
        {
            for(int dis=1;true;dis++)
            {
                int eqcol=col+dis*dir[di][0];
                int eqrow=row+dis*dir[di][1];
                if(eqcol<0 || eqrow<0 || eqcol>=chess[0].length || eqrow>=chess.length)
                {
                    break;
                }
                if(chess[eqrow][eqcol]==true)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void nqueenProactive(boolean[][] chess,int qpsf,String asf,int lqpb)
    {
        if(qpsf==chess.length)
        {
            count++;
            System.out.println(count+". "+asf);
            return;
        }
        for(int b=lqpb+1;b<chess.length*chess.length;b++)
        {
            int row=b/chess.length;
            int col=b%chess.length;
            if(chess[row][col]==false)
            {
                if(queenIssafe(row, col, chess)==true)
                {
                    chess[row][col]=true;
                    nqueenProactive(chess, qpsf+1, asf+"q"+(qpsf+1)+"b"+b+" ", b);
                    chess[row][col]=false;
                }
            }
        }
    }
    public static void main(String args[])
    {
        boolean[][] chess =new boolean[4][4];
        nqueenProactive(chess, 0, "", -1);
    }

}