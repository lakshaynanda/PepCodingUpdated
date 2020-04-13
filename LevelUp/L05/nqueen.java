import java.util.*;
public class nqueen {
    static int count=0;
    public static boolean queenIsSafe(boolean[][] chess,int row,int col)
    {
        int [][]dir={
            {0,-1}, //north
            {1,-1}, //north east
            {1,0}, //east
            {1,1}, //SE
            {0,1}, //South
            {-1,1}, //SW
            {-1,0}, //W
            {-1,-1}, //NW
        };
        for(int di=0;di<dir.length;di++){
            for(int dis=1;true;dis++)
            {
                int r=row+dis*dir[di][1];
                int c=col+dis*dir[di][0];
                if(r<0 || c<0 || r>=chess.length || c>=chess[0].length)
                {
                    break;
                }
                if(chess[r][c]==true)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void nQueen(boolean[][] chess,int nq,String asf,int qp)
    {
        if(nq==chess.length)
        {
            count++;
            System.out.println(count+". "+asf);
            return;
        }
        for(int b=qp+1;b<chess.length*chess[0].length;b++)
        {
            int row=b/chess.length;
            int col=b%chess.length;
            if(queenIsSafe(chess,row,col)==true)
            {
                if(chess[row][col]==false)
                {
                    chess[row][col]=true;
                    nQueen(chess, nq+1, asf+ "q"+(nq+1)+"b"+b+" ", b);
                    chess[row][col]=false;
                }
            }
        }
    }
    public static void main(String args[])
    {
        boolean[][] chess=new boolean[4][4];
        long start=System.currentTimeMillis();
        nQueen(chess, 0, "", -1);
        long end=System.currentTimeMillis();
        System.out.println(end-start);        
    }

}